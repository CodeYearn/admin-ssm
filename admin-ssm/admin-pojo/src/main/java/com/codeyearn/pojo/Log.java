package com.codeyearn.pojo;

import java.util.Date;

/**
 * @Author CaiYu
 * @Data 2019/5/10 20:17
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class Log {

    private Integer logID;
    private String username;
    private String ip;
    private String url;
    private String method;
    private Date visitTime;
    private Long executionTime;

    public Log() {
    }

    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logID=" + logID +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", visitTime=" + visitTime +
                ", executionTime=" + executionTime +
                '}';
    }
}
