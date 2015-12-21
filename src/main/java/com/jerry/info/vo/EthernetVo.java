package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 以太网信息
 */
public class EthernetVo {
    private int index;//编号
    private String address;//IP地址
    private String broadcast;//网关广播地址
    private String hwaddr;//网卡MAC地址
    private String netmask;//子网掩码
    private String description;//网卡描述信息
    private String type;//网卡类型

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public String getHwaddr() {
        return hwaddr;
    }

    public void setHwaddr(String hwaddr) {
        this.hwaddr = hwaddr;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EthernetVo{" +
                "index=" + index +
                ", address='" + address + '\'' +
                ", broadcast='" + broadcast + '\'' +
                ", hwaddr='" + hwaddr + '\'' +
                ", netmask='" + netmask + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
