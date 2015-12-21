package com.jerry.info.vo;

/**
 * Created by Jerry on 15/12/10.
 * 操作系统信息
 */
public class OsVo {
    // 操作系统内核类型如： 386、486、586等x86
    private String arch;//操作系统
    private String cpu_endian;//操作系统CpuEndian
    private String data_model;//操作系统DataModel
    // 系统描述
    private String description;//操作系统的描述
    // 操作系统类型
    private String name;//操作系统名称
    private String patch_level;//操作系统 等级
    // 操作系统的卖主
    private String vendor;//操作系统的卖主
    private String vendor_code_name;//操作系统的卖主名
    // 操作系统名称
    private String vendor_name;//操作系统名称
    //操作系统卖主类型
    private String vendor_version;//操作系统卖主类型
    // 操作系统的版本号
    private String version;//操作系统的版本号

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getCpu_endian() {
        return cpu_endian;
    }

    public void setCpu_endian(String cpu_endian) {
        this.cpu_endian = cpu_endian;
    }

    public String getData_model() {
        return data_model;
    }

    public void setData_model(String data_model) {
        this.data_model = data_model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatch_level() {
        return patch_level;
    }

    public void setPatch_level(String patch_level) {
        this.patch_level = patch_level;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor_code_name() {
        return vendor_code_name;
    }

    public void setVendor_code_name(String vendor_code_name) {
        this.vendor_code_name = vendor_code_name;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_version() {
        return vendor_version;
    }

    public void setVendor_version(String vendor_version) {
        this.vendor_version = vendor_version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "OsInfo{" +
                "arch='" + arch + '\'' +
                ", cpu_endian='" + cpu_endian + '\'' +
                ", data_model='" + data_model + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", patch_level='" + patch_level + '\'' +
                ", vendor='" + vendor + '\'' +
                ", vendor_code_name='" + vendor_code_name + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", vendor_version='" + vendor_version + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
