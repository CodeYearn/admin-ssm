package com.codeyearn.controller;

import com.codeyearn.pojo.Role;
import com.codeyearn.pojo.User;
import com.codeyearn.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 18:14
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userID") Integer userID,@RequestParam(name = "ids") Integer[] ids){
        userService.addRoleToUser(userID,ids);
        return "redirect:/user/getAllUser.do";
    }

    @RequestMapping("/addRoleByUserID.do")
    public ModelAndView addRoleByUserID(@RequestParam(name = "userID") Integer userID){
        ModelAndView mv = new ModelAndView();
        User user = userService.getUserByUserID(userID);
        List<Role> orherRoles = userService.getUserOtherRolesByUserID(userID);
        mv.addObject("user",user);
        mv.addObject("orherRoles",orherRoles);
        mv.setViewName("user-role-add");
        return mv;
    }

    @RequestMapping("/getAllUser.do")
    public ModelAndView getAllUser(@RequestParam(name = "pageNumber",defaultValue = "1") Integer pageNumber,@RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize){
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.getAllUser(pageNumber,pageSize);
        PageInfo pageInfo = new PageInfo(userList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/postUser.do")
    public String postUser(User user){
        userService.postUser(user);
        return "redirect:/user/getAllUser.do";
    }

    @RequestMapping("/getUserByUserID.do")
    public ModelAndView getUserByUserID(@RequestParam(name = "userID") Integer userID){
        ModelAndView mv = new ModelAndView();
        User user = userService.getUserByUserID(userID);
        mv.addObject("user",user);
        mv.setViewName("user-show");
        return mv;
    }
}
