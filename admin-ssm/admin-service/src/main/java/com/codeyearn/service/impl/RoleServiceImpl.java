package com.codeyearn.service.impl;

import com.codeyearn.dao.RoleDao;
import com.codeyearn.pojo.Role;
import com.codeyearn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 22:29
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getAllRole() {
        return roleDao.getAllRole();
    }

    @Override
    public void postRole(Role role) {
        roleDao.postRole(role);
    }
}
