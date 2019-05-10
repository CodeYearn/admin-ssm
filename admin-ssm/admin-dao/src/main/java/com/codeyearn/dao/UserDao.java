package com.codeyearn.dao;

import com.codeyearn.pojo.Role;
import com.codeyearn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 11:16
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface UserDao {

    @Select("select * from tb_user where username = #{username}")
    @Results({
            @Result(property = "userID",column = "userID",id = true),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "userPhone",column = "userPhone"),
            @Result(property = "userEmail",column = "userEmail"),
            @Result(property = "userStatus",column = "userStatus"),
            @Result(property = "roleList",column = "userID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.RoleDao.getRoleByUserID"))
    })
    User getUserByUsername(String username);


    @Select("select * from tb_user")
    List<User> getAllUser();

    @Insert("insert into tb_user values(null,#{username},#{password},#{userPhone},#{userEmail},#{userStatus})")
    void postUser(User user);

    @Select("select * from tb_user where userID = #{userID}")
    @Results({
            @Result(property = "userID",column = "userID",id = true),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "userPhone",column = "userPhone"),
            @Result(property = "userEmail",column = "userEmail"),
            @Result(property = "userStatus",column = "userStatus"),
            @Result(property = "roleList",column = "userID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.RoleDao.getRoleByUserID"))
    })
    User getUserByUserID(int userID);

    @Select("select * from tb_user where userID in (select userID from tb_user_role where roleID = #{roleID})")
    List<User> getUserByRoleID(int roleID);

    @Select("select * from tb_role where roleID not in (select roleID from tb_user_role where userID = #{userID})")
    List<Role> getUserOtherRolesByUserID(int userID);

    @Insert("insert into tb_user_role values(#{userID},#{roleID})")
    void addRoleToUser(@Param("userID") int userID,@Param("roleID") int id);
}
