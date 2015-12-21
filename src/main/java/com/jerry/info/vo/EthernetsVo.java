package com.jerry.info.vo;

import java.util.List;

/**
 * Created by Jerry on 15/12/15.
 */
public class EthernetsVo {
    private int num;//有多少个以太网信息
    private List<EthernetVo> ethernetVos ;//以太网信息详情

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<EthernetVo> getEthernetVos() {
        return ethernetVos;
    }

    public void setEthernetVos(List<EthernetVo> ethernetVos) {
        this.ethernetVos = ethernetVos;
    }

    @Override
    public String toString() {
        return "EthernetsVo{" +
                "num=" + num +
                ", ethernetVos=" + ethernetVos +
                '}';
    }
}
