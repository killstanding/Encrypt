package com.jerry.info.vo;

import java.util.List;

/**
 * Created by Jerry on 15/12/14.
 */
public class CpusVo {
    private int num ; //cpu 个数
    private List<CpuVo> cpuVos; // cpu具体信息；

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<CpuVo> getCpuVos() {
        return cpuVos;
    }

    public void setCpuVos(List<CpuVo> cpuVos) {
        this.cpuVos = cpuVos;
    }

    @Override
    public String toString() {
        return "CpusVo{" +
                "num=" + num +
                ", cpuVos=" + cpuVos +
                '}';
    }
}
