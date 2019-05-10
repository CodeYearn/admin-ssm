package com.codeyearn.controller;

import com.codeyearn.pojo.Log;
import com.codeyearn.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author CaiYu
 * @Data 2019/5/10 19:31
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Component
@Aspect
public class SystemLog {

    @Autowired
    LogService logService;

    @Autowired
    private HttpServletRequest request;

    private Date visitTime;  //执行时间
    private Class clazz;  //执行的类
    private Method method;  //执行的方法

    @Before("execution(* com.codeyearn.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        visitTime = new Date();  //当前时间
        clazz = jp.getTarget().getClass();  //获取具体访问的类
        String methodName = jp.getSignature().getName();//获取方法的名字
        Object[] args = jp.getArgs();  //获取方法的参数
        //获取具体的方法对象
        if (args == null || args.length == 0){
            method = clazz.getMethod(methodName);
        }else{
            Class[] argsClass = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                argsClass[i] = args[i].getClass();
            }
            clazz.getMethod(methodName,argsClass);
        }
    }


    @After("execution(* com.codeyearn.controller.*.*(..))")
    public void doAfter(){
        long executionTime = new Date().getTime() - visitTime.getTime();  //执行时长
        //获取url
        String url = null;
        if (clazz!=null&&method!=null&&clazz!= SystemLog.class){
            //获取类上的RequestMapping("/**")
            RequestMapping clazzAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (clazzAnnotation!=null){
                String[] clazzValue = clazzAnnotation.value();
                //获取方法上的RequestMapping("/**")
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if (methodAnnotation!=null){
                    String[] methodValue = methodAnnotation.value();
                    url = clazzValue[0] + methodValue[0];
                    //获取ip
                    String ip = request.getRemoteAddr();
                    //获取操作用户
                    SecurityContext sc = new SecurityContextHolder().getContext();
                    User user = (User) sc.getAuthentication().getPrincipal();
                    String username = user.getUsername();

                    //把获取的数据封装到Log对象中
                    Log log = new Log();
                    log.setUsername(username);
                    log.setIp(ip);
                    log.setUrl(url);
                    log.setMethod("[类名 ]" + clazz.getName() + "[方法名] " + method.getName());
                    log.setVisitTime(visitTime);
                    log.setExecutionTime(executionTime);

                    //存到数据库中
                    logService.save(log);
                }
            }
        }
        System.out.println();
        System.out.println(request.getServletPath());
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL().toString());
        System.out.println();
    }
}
