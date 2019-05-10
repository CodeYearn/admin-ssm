package com.codeyearn.controller;

import com.codeyearn.pojo.Log;
import com.codeyearn.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/10 21:08
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/systemLog")
public class SystemLogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/getAllLog.do")
    public ModelAndView getAllLog(){
        ModelAndView mv = new ModelAndView();
        List<Log> logList = logService.getAllLog();
        mv.addObject("logList",logList);
        mv.setViewName("syslog-list");
        return mv;
    }

}
