package com.codeyearn.service.impl;

import com.codeyearn.dao.AuthorityDao;
import com.codeyearn.pojo.Authority;
import com.codeyearn.pojo.Role;
import com.codeyearn.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 23:03
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;


    @Override
    public void postAuthority(Authority authority) {
        authorityDao.postAuthority(authority);
    }

    @Override
    public List<Authority> getAllAuthority() {
        return authorityDao.getAllAuthority();
    }

    @Override
    public Authority getAuthority(Integer authorityID) {
        return authorityDao.getAuthority(authorityID);
    }

    @Override
    public List<Role> getAuthorityOtherRole(Integer authorityID) {
        return authorityDao.getAuthorityOtherRole(authorityID);
    }

    @Override
    public void addRoleToAuthority(Integer authorityID, Integer[] ids) {
        for (int id : ids) {
            authorityDao.addRoleToAuthority(id,authorityID);
        }
    }
}
