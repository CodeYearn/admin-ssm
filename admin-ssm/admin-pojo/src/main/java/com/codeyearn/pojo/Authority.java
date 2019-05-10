package com.codeyearn.pojo;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 11:04
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Authority {

    private Integer authorityID;
    private String authorityName;
    private String authorityURL;

    private List<Role> roleList;

    public Authority() {
    }

    public Integer getAuthorityID() {
        return authorityID;
    }

    public void setAuthorityID(Integer authorityID) {
        this.authorityID = authorityID;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityURL() {
        return authorityURL;
    }

    public void setAuthorityURL(String authorityURL) {
        this.authorityURL = authorityURL;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityID=" + authorityID +
                ", authorityName='" + authorityName + '\'' +
                ", authorityURL='" + authorityURL + '\'' +
                ", roleList=" + roleList +
                '}';
    }
}
