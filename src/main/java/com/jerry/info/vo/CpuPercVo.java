package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/14.
 * cpu 运行状况
 */
public class CpuPercVo {
    private String  user;//CPU用户使用率
    private String  sys;//CPU系统使用率
    private String  wait;//CPU当前等待率
    private String  nice;//CPU当前错误率
    private String  idle;//CPU当前空闲率
    private String  combined;//CPU总的使用率

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getWait() {
        return wait;
    }

    public void setWait(String wait) {
        this.wait = wait;
    }

    public String getNice() {
        return nice;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }

    public String getIdle() {
        return idle;
    }

    public void setIdle(String idle) {
        this.idle = idle;
    }

    public String getCombined() {
        return combined;
    }

    public void setCombined(String combined) {
        this.combined = combined;
    }

    @Override
    public String toString() {
        return "CpuPercInfo{" +
                "user='" + user + '\'' +
                ", sys='" + sys + '\'' +
                ", wait='" + wait + '\'' +
                ", nice='" + nice + '\'' +
                ", idle='" + idle + '\'' +
                ", combined='" + combined + '\'' +
                '}';
    }
}
