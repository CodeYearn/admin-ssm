package com.codeyearn.service;

import com.codeyearn.pojo.Role;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 22:29
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface RoleService {

    List<Role> getAllRole();

    void postRole(Role role);
}
