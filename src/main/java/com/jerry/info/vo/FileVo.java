package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 文件系统信息
 */
public class FileVo {

    private int index;//磁盘编号
    // 分区的盘符名称
    private String dev_name; //盘符名称 DevName
    // 分区的盘符名称
    private String dir_name; //盘符路径
    private String flags; //盘符标志 Flags
    // 文件系统类型，比如 FAT32、NTFS
    private String sys_type_name; //盘符类型
    // 文件系统类型名，比如本地硬盘、光驱、网络文件系统等
    private String type_name; //盘符类型名
    // 文件系统类型
    private String type; //盘符文件系统类型

    // 文件系统总大小
    private long total; //总大小  KB
    // 文件系统剩余大小
    private long free; //剩余大小  KB
    // 文件系统可用大小
    private long avail; //可用大小  KB
    // 文件系统已经使用量
    private long used; //已经使用量  KB
    // 文件系统资源的利用率
    private String use_percent; //资源的利用率  %
    //读出
    private long disk_reads; //读出
    //写入
    private long disk_writes; //写入

    public String getDev_name() {
        return dev_name;
    }

    public void setDev_name(String dev_name) {
        this.dev_name = dev_name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDir_name() {
        return dir_name;
    }

    public void setDir_name(String dir_name) {
        this.dir_name = dir_name;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getSys_type_name() {
        return sys_type_name;
    }

    public void setSys_type_name(String sys_type_name) {
        this.sys_type_name = sys_type_name;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getFree() {
        return free;
    }

    public void setFree(long free) {
        this.free = free;
    }

    public long getAvail() {
        return avail;
    }

    public void setAvail(long avail) {
        this.avail = avail;
    }

    public long getUsed() {
        return used;
    }

    public void setUsed(long used) {
        this.used = used;
    }

    public String getUse_percent() {
        return use_percent;
    }

    public void setUse_percent(String use_percent) {
        this.use_percent = use_percent;
    }

    public long getDisk_reads() {
        return disk_reads;
    }

    public void setDisk_reads(long disk_reads) {
        this.disk_reads = disk_reads;
    }

    public long getDisk_writes() {
        return disk_writes;
    }

    public void setDisk_writes(long disk_writes) {
        this.disk_writes = disk_writes;
    }

    @Override
    public String toString() {
        return "FileVo{" +
                "index=" + index +
                ", dev_name='" + dev_name + '\'' +
                ", dir_name='" + dir_name + '\'' +
                ", flags='" + flags + '\'' +
                ", sys_type_name='" + sys_type_name + '\'' +
                ", type_name='" + type_name + '\'' +
                ", type='" + type + '\'' +
                ", total=" + total +
                ", free=" + free +
                ", avail=" + avail +
                ", used=" + used +
                ", use_percent='" + use_percent + '\'' +
                ", disk_reads=" + disk_reads +
                ", disk_writes=" + disk_writes +
                '}';
    }
}
