package com.codeyearn.service.impl;

import com.codeyearn.dao.UserDao;
import com.codeyearn.pojo.Role;
import com.codeyearn.pojo.User;
import com.codeyearn.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 10:48
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByUsername(username);
        System.out.println();
        System.out.println(user);
        System.out.println();
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(),
                (user.getUserStatus() == 1 ? true : false),true,
                true,true,
                getAuthority(user.getRoleList()));
    }

    private List<SimpleGrantedAuthority> getAuthority(List<Role> roleList) {
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        for (Role role : roleList) {
            authorityList.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }
        return authorityList;
    }

    @Override
    public List<User> getAllUser(Integer pageNumber,Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        return userDao.getAllUser();
    }

    @Override
    public void postUser(User user) {
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userDao.postUser(user);
    }

    @Override
    public User getUserByUserID(Integer userID) {
        return userDao.getUserByUserID(userID);
    }

    @Override
    public List<Role> getUserOtherRolesByUserID(Integer userID) {
        return userDao.getUserOtherRolesByUserID(userID);
    }

    @Override
    public void addRoleToUser(Integer userID, Integer[] ids) {
        for (int id : ids) {
            userDao.addRoleToUser(userID,id);
        }
    }
}
