package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 用户信息
 */
public class WhoVo {
    private int index;//用户编号
    private String device;//用户控制台
    private String host;//用户host
    private String time;//getTime
    // 当前系统进程表中的用户名
    private String user;//当前系统进程表中的用户名

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "WhoVo{" +
                "index=" + index +
                ", device='" + device + '\'' +
                ", host='" + host + '\'' +
                ", time='" + time + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
