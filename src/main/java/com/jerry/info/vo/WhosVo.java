package com.jerry.info.vo;

import java.util.List;

/**
 * Created by Jerry on 15/12/14.
 */
public class WhosVo {
    private int num;//用户数量
    private List<WhoVo> whoVos; //用户详情

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<WhoVo> getWhoVos() {
        return whoVos;
    }

    public void setWhoVos(List<WhoVo> whoVos) {
        this.whoVos = whoVos;
    }

    @Override
    public String toString() {
        return "WhosVo{" +
                "num=" + num +
                ", whoVos=" + whoVos +
                '}';
    }
}
