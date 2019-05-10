package com.codeyearn.pojo;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/9 10:56
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class User {

    private Integer userID;
    private String username;
    private String password;
    private String userPhone;
    private String userEmail;

    private Integer userStatus;
    private String userStatusString;

    private List<Role> roleList;

    public User() {
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatusString() {
        if (this.userStatus != null){
            if (this.userStatus == 1){
                this.userStatusString = "已开启";
            }else{
                this.userStatusString = "未开启";
            }
        }
        return userStatusString;
    }

    public void setUserStatusString(String userStatusString) {
        this.userStatusString = userStatusString;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userStatus=" + userStatus +
                ", userStatusString='" + userStatusString + '\'' +
                ", roleList=" + roleList +
                '}';
    }
}
