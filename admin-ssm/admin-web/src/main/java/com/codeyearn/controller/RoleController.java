package com.codeyearn.controller;

import com.codeyearn.pojo.Role;
import com.codeyearn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 22:27
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/getAllRole.do")
    public ModelAndView getAllRole() {
        ModelAndView mv = new ModelAndView();
        List<Role> roleList = roleService.getAllRole();
        mv.addObject("roleList", roleList);
        mv.setViewName("role-list");
        return mv;
    }

    @RequestMapping("/postRole.do")
    public String postRole(Role role) {
        roleService.postRole(role);
        return "redirect:/role/getAllRole.do";
    }

}
