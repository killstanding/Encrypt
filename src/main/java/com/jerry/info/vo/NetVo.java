package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 网络信息
 */
public class NetVo {
    private int  index; //编号
    private String name;//网络设备名
    private String address;//IP地址
    private String netmask;//子网掩码
    private String rxpackets;//接收的总包裹数
    private String txpackets;//发送的总包裹数
    private String rxbytes;//接收到的总字节数
    private String txbytes;//发送的总字节数
    private String rxerrors;//接收到的错误包数
    private String txerrors;//发送数据包时的错误数
    private String rxdropped;//接收时丢弃的包数
    private String txdropped;//发送时丢弃的包数

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public String getRxpackets() {
        return rxpackets;
    }

    public void setRxpackets(String rxpackets) {
        this.rxpackets = rxpackets;
    }

    public String getTxpackets() {
        return txpackets;
    }

    public void setTxpackets(String txpackets) {
        this.txpackets = txpackets;
    }

    public String getRxbytes() {
        return rxbytes;
    }

    public void setRxbytes(String rxbytes) {
        this.rxbytes = rxbytes;
    }

    public String getTxbytes() {
        return txbytes;
    }

    public void setTxbytes(String txbytes) {
        this.txbytes = txbytes;
    }

    public String getRxerrors() {
        return rxerrors;
    }

    public void setRxerrors(String rxerrors) {
        this.rxerrors = rxerrors;
    }

    public String getTxerrors() {
        return txerrors;
    }

    public void setTxerrors(String txerrors) {
        this.txerrors = txerrors;
    }

    public String getRxdropped() {
        return rxdropped;
    }

    public void setRxdropped(String rxdropped) {
        this.rxdropped = rxdropped;
    }

    public String getTxdropped() {
        return txdropped;
    }

    public void setTxdropped(String txdropped) {
        this.txdropped = txdropped;
    }

    @Override
    public String toString() {
        return "NetVo{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", netmask='" + netmask + '\'' +
                ", rxpackets='" + rxpackets + '\'' +
                ", txpackets='" + txpackets + '\'' +
                ", rxbytes='" + rxbytes + '\'' +
                ", txbytes='" + txbytes + '\'' +
                ", rxerrors='" + rxerrors + '\'' +
                ", txerrors='" + txerrors + '\'' +
                ", rxdropped='" + rxdropped + '\'' +
                ", txdropped='" + txdropped + '\'' +
                '}';
    }
}
