package com.codeyearn.service;

import com.codeyearn.pojo.Authority;
import com.codeyearn.pojo.Role;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 23:00
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface AuthorityService {

    void postAuthority(Authority authority);

    List<Authority> getAllAuthority();

    Authority getAuthority(Integer authorityID);

    List<Role> getAuthorityOtherRole(Integer authorityID);

    void addRoleToAuthority(Integer authorityID, Integer[] ids);
}
