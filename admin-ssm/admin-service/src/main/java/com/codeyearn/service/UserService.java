package com.codeyearn.service;

import com.codeyearn.pojo.Role;
import com.codeyearn.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 10:47
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface UserService extends UserDetailsService {

    List<User> getAllUser(Integer pageNumber,Integer pageSize);

    void postUser(User user);

    User getUserByUserID(Integer userID);

    List<Role> getUserOtherRolesByUserID(Integer userID);

    void addRoleToUser(Integer userID, Integer[] ids);
}
