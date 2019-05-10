package com.codeyearn.dao;

import com.codeyearn.pojo.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 14:34
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface RoleDao {

    @Select("select * from tb_role where roleID in (select roleID from tb_user_role where userID = #{userID})")
    @Results({
            @Result(property = "roleID",column = "roleID",id = true),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDescription",column = "roleDescription"),
            @Result(property = "userList",column = "roleID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.UserDao.getUserByRoleID")),
            @Result(property = "authorityList",column = "roleID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.AuthorityDao.getAuthorityByRoleID"))
    })
    List<Role> getRoleByUserID(int userID);

    @Select("select * from tb_role")
    @Results({
            @Result(property = "roleID",column = "roleID",id = true),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDescription",column = "roleDescription"),
            @Result(property = "userList",column = "roleID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.UserDao.getUserByRoleID")),
            @Result(property = "authorityList",column = "roleID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.AuthorityDao.getAuthorityByRoleID"))
    })
    List<Role> getAllRole();


    @Insert("insert into tb_role values(null,#{roleName},#{roleDescription})")
    void postRole(Role role);
}
