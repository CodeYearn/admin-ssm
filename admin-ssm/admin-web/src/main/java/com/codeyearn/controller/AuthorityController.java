package com.codeyearn.controller;

import com.codeyearn.pojo.Authority;
import com.codeyearn.pojo.Role;
import com.codeyearn.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 23:06
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/authority")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("/addRoleToAuthority.do")
    public String addRoleToAuthority(@RequestParam(name = "authorityID") Integer authorityID,@RequestParam(name = "ids") Integer[] ids){
        authorityService.addRoleToAuthority(authorityID,ids);
        return "redirect:/authority/getAllAuthority.do";
    }

    @RequestMapping("/addAuthority.do")
    public ModelAndView addAuthority(@RequestParam(name = "authorityID") Integer authorityID){
        ModelAndView mv = new ModelAndView();
        Authority authority = authorityService.getAuthority(authorityID);
        List<Role> otherRole = authorityService.getAuthorityOtherRole(authorityID);
        mv.addObject("authority",authority);
        mv.addObject("otherRole",otherRole);
        mv.setViewName("role-authority-add");
        return mv;
    }

    @RequestMapping("/postAuthority.do")
    public String postAuthority(Authority authority){
        authorityService.postAuthority(authority);
        return "redirect:/authority/getAllAuthority.do";
    }

    @RequestMapping("/getAllAuthority.do")
    public ModelAndView getAllAuthority(){
        ModelAndView mv = new ModelAndView();
        List<Authority> authorityList = authorityService.getAllAuthority();
        mv.addObject("authorityList",authorityList);
        mv.setViewName("authority-list");
        return mv;
    }

}
