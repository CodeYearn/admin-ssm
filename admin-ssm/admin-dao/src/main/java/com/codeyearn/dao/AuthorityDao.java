package com.codeyearn.dao;

import com.codeyearn.pojo.Authority;
import com.codeyearn.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 21:27
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface AuthorityDao {

    @Select("select * from tb_authority where authorityID in (select authorityID from tb_role_authority where roleID = #{roleID})")
    List<Authority> getAuthorityByRoleID(int roleID);

    @Insert("insert into tb_authority values(null,#{authorityName},#{authorityURL})")
    void postAuthority(Authority authority);

    @Select("select * from tb_authority")
    List<Authority> getAllAuthority();

    @Select("select * from tb_authority where authorityID = #{authorityID}")
    Authority getAuthority(int authorityID);

    @Select("select * from tb_role where roleID not in (select roleID from tb_role_authority where authorityID = #{authorityID})")
    List<Role> getAuthorityOtherRole(int authorityID);

    @Insert("insert into tb_role_authority values(#{roleID},#{authorityID})")
    void addRoleToAuthority(@Param("roleID") int id,@Param("authorityID") int authorityID);

}
