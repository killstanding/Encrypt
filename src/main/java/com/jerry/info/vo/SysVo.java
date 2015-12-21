package com.jerry.info.vo;
/**
 * Created by Jerry on 15/12/10_
 * System信息，从jvm获取
 */
public class SysVo {

    private String user;//用户名
    private String computer_name;//计算机名
    private String user_domain;//计算机域名
    private String ip;//本地ip地址
    private String host_name;//本地主机名
    private long total_memory;//JVM可以使用的总内存
    private long free_memory;//JVM可以使用的剩余内存
    private String available_processors;//JVM可以使用的处理器个数
    private String java_version;//Java的运行环境版本
    private String java_vendor;//Java的运行环境供应商
    private String java_vendor_url;//Java供应商的URL
    private String java_home;//Java的安装路径
    private String java_vm_specification_version;//Java的虚拟机规范版本
    private String java_vm_specification_vendor;//Java的虚拟机规范供应商
    private String java_vm_specification_name;//Java的虚拟机规范名称
    private String java_vm_version;//Java的虚拟机实现版本
    private String java_vm_vendor;//Java的虚拟机实现供应商
    private String java_vm_name;//Java的虚拟机实现名称
    private String java_specification_version;//Java运行时环境规范版本
    private String java_specification_vender;//Java运行时环境规范供应商
    private String java_specification_name;//Java运行时环境规范名称
    private String java_class_version;//Java的类格式版本号
    private String java_class_path;//Java的类路径

    private String java_library_path;//加载库时搜索的路径列表
    private String java_io_tmpdir;//默认的临时文件路径
    private String java_ext_dirs;//一个或多个扩展目录的路径
    private String os_name;//操作系统的名称
    private String os_arch;//操作系统的构架
    private String os_version;//操作系统的版本
    private String file_separator;//文件分隔符
    private String path_separator;//路径分隔符
    private String line_separator;//行分隔符
    private String user_name;//用户的账户名称
    private String user_home;//用户的主目录
    private String user_dir;//用户的当前工作目录

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComputer_name() {
        return computer_name;
    }

    public void setComputer_name(String computer_name) {
        this.computer_name = computer_name;
    }

    public String getUser_domain() {
        return user_domain;
    }

    public void setUser_domain(String user_domain) {
        this.user_domain = user_domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public long getTotal_memory() {
        return total_memory;
    }

    public void setTotal_memory(long total_memory) {
        this.total_memory = total_memory;
    }

    public long getFree_memory() {
        return free_memory;
    }

    public void setFree_memory(long free_memory) {
        this.free_memory = free_memory;
    }

    public String getAvailable_processors() {
        return available_processors;
    }

    public void setAvailable_processors(String available_processors) {
        this.available_processors = available_processors;
    }

    public String getJava_version() {
        return java_version;
    }

    public void setJava_version(String java_version) {
        this.java_version = java_version;
    }

    public String getJava_vendor() {
        return java_vendor;
    }

    public void setJava_vendor(String java_vendor) {
        this.java_vendor = java_vendor;
    }

    public String getJava_vendor_url() {
        return java_vendor_url;
    }

    public void setJava_vendor_url(String java_vendor_url) {
        this.java_vendor_url = java_vendor_url;
    }

    public String getJava_home() {
        return java_home;
    }

    public void setJava_home(String java_home) {
        this.java_home = java_home;
    }

    public String getJava_vm_specification_version() {
        return java_vm_specification_version;
    }

    public void setJava_vm_specification_version(String java_vm_specification_version) {
        this.java_vm_specification_version = java_vm_specification_version;
    }

    public String getJava_vm_specification_vendor() {
        return java_vm_specification_vendor;
    }

    public void setJava_vm_specification_vendor(String java_vm_specification_vendor) {
        this.java_vm_specification_vendor = java_vm_specification_vendor;
    }

    public String getJava_vm_specification_name() {
        return java_vm_specification_name;
    }

    public void setJava_vm_specification_name(String java_vm_specification_name) {
        this.java_vm_specification_name = java_vm_specification_name;
    }

    public String getJava_vm_version() {
        return java_vm_version;
    }

    public void setJava_vm_version(String java_vm_version) {
        this.java_vm_version = java_vm_version;
    }

    public String getJava_vm_vendor() {
        return java_vm_vendor;
    }

    public void setJava_vm_vendor(String java_vm_vendor) {
        this.java_vm_vendor = java_vm_vendor;
    }

    public String getJava_vm_name() {
        return java_vm_name;
    }

    public void setJava_vm_name(String java_vm_name) {
        this.java_vm_name = java_vm_name;
    }

    public String getJava_specification_version() {
        return java_specification_version;
    }

    public void setJava_specification_version(String java_specification_version) {
        this.java_specification_version = java_specification_version;
    }

    public String getJava_specification_vender() {
        return java_specification_vender;
    }

    public void setJava_specification_vender(String java_specification_vender) {
        this.java_specification_vender = java_specification_vender;
    }

    public String getJava_specification_name() {
        return java_specification_name;
    }

    public void setJava_specification_name(String java_specification_name) {
        this.java_specification_name = java_specification_name;
    }

    public String getJava_class_version() {
        return java_class_version;
    }

    public void setJava_class_version(String java_class_version) {
        this.java_class_version = java_class_version;
    }

    public String getJava_class_path() {
        return java_class_path;
    }

    public void setJava_class_path(String java_class_path) {
        this.java_class_path = java_class_path;
    }

    public String getJava_library_path() {
        return java_library_path;
    }

    public void setJava_library_path(String java_library_path) {
        this.java_library_path = java_library_path;
    }

    public String getJava_io_tmpdir() {
        return java_io_tmpdir;
    }

    public void setJava_io_tmpdir(String java_io_tmpdir) {
        this.java_io_tmpdir = java_io_tmpdir;
    }

    public String getJava_ext_dirs() {
        return java_ext_dirs;
    }

    public void setJava_ext_dirs(String java_ext_dirs) {
        this.java_ext_dirs = java_ext_dirs;
    }

    public String getOs_name() {
        return os_name;
    }

    public void setOs_name(String os_name) {
        this.os_name = os_name;
    }

    public String getOs_arch() {
        return os_arch;
    }

    public void setOs_arch(String os_arch) {
        this.os_arch = os_arch;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getFile_separator() {
        return file_separator;
    }

    public void setFile_separator(String file_separator) {
        this.file_separator = file_separator;
    }

    public String getPath_separator() {
        return path_separator;
    }

    public void setPath_separator(String path_separator) {
        this.path_separator = path_separator;
    }

    public String getLine_separator() {
        return line_separator;
    }

    public void setLine_separator(String line_separator) {
        this.line_separator = line_separator;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_home() {
        return user_home;
    }

    public void setUser_home(String user_home) {
        this.user_home = user_home;
    }

    public String getUser_dir() {
        return user_dir;
    }

    public void setUser_dir(String user_dir) {
        this.user_dir = user_dir;
    }

    @Override
    public String toString() {
        return "SysVo{" +
                "user='" + user + '\'' +
                ", computer_name='" + computer_name + '\'' +
                ", user_domain='" + user_domain + '\'' +
                ", ip='" + ip + '\'' +
                ", host_name='" + host_name + '\'' +
                ", total_memory=" + total_memory +
                ", free_memory=" + free_memory +
                ", available_processors='" + available_processors + '\'' +
                ", java_version='" + java_version + '\'' +
                ", java_vendor='" + java_vendor + '\'' +
                ", java_vendor_url='" + java_vendor_url + '\'' +
                ", java_home='" + java_home + '\'' +
                ", java_vm_specification_version='" + java_vm_specification_version + '\'' +
                ", java_vm_specification_vendor='" + java_vm_specification_vendor + '\'' +
                ", java_vm_specification_name='" + java_vm_specification_name + '\'' +
                ", java_vm_version='" + java_vm_version + '\'' +
                ", java_vm_vendor='" + java_vm_vendor + '\'' +
                ", java_vm_name='" + java_vm_name + '\'' +
                ", java_specification_version='" + java_specification_version + '\'' +
                ", java_specification_vender='" + java_specification_vender + '\'' +
                ", java_specification_name='" + java_specification_name + '\'' +
                ", java_class_version='" + java_class_version + '\'' +
                ", java_class_path='" + java_class_path + '\'' +
                ", java_library_path='" + java_library_path + '\'' +
                ", java_io_tmpdir='" + java_io_tmpdir + '\'' +
                ", java_ext_dirs='" + java_ext_dirs + '\'' +
                ", os_name='" + os_name + '\'' +
                ", os_arch='" + os_arch + '\'' +
                ", os_version='" + os_version + '\'' +
                ", file_separator='" + file_separator + '\'' +
                ", path_separator='" + path_separator + '\'' +
                ", line_separator='" + line_separator + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_home='" + user_home + '\'' +
                ", user_dir='" + user_dir + '\'' +
                '}';
    }
}
