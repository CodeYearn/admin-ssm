package com.codeyearn.pojo;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 11:00
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Role {

    private Integer roleID;
    private String roleName;
    private String roleDescription;

    private List<User> userList;
    private List<Authority> authorityList;

    public Role() {
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Authority> authorityList) {
        this.authorityList = authorityList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", userList=" + userList +
                ", authorityList=" + authorityList +
                '}';
    }
}
