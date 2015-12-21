package com.jerry.info.vo;

import java.util.List;

/**
 * Created by Jerry on 15/12/15.
 */
public class NetsVo {

    private int num;//有多少个网络设备
    private List<NetVo> netVos ;//网络设备详情

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<NetVo> getNetVos() {
        return netVos;
    }

    public void setNetVos(List<NetVo> netVos) {
        this.netVos = netVos;
    }

    @Override
    public String toString() {
        return "NetsVo{" +
                "num=" + num +
                ", netVos=" + netVos +
                '}';
    }
}
