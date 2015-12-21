package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * cpu信息
 */
public class CpuVo {
    private int index; //cpu 编号
    private String mhz;//CPU的总量MHz
    private String vendor;//CPU生产商 如：Intel
    private String model;//CPU类别 如：Celeron
    private String cache_size;//CPU缓存数量
    private CpuPercVo cpuPercVo;// cpu运行状态

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMhz() {
        return mhz;
    }

    public void setMhz(String mhz) {
        this.mhz = mhz;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCache_size() {
        return cache_size;
    }

    public void setCache_size(String cache_size) {
        this.cache_size = cache_size;
    }

    public CpuPercVo getCpuPercVo() {
        return cpuPercVo;
    }

    public void setCpuPercVo(CpuPercVo cpuPercVo) {
        this.cpuPercVo = cpuPercVo;
    }

    @Override
    public String toString() {
        return "CpuVo{" +
                "index=" + index +
                ", mhz='" + mhz + '\'' +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", cache_size='" + cache_size + '\'' +
                ", cpuPercVo=" + cpuPercVo +
                '}';
    }
}
