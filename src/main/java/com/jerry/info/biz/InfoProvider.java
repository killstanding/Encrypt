package com.jerry.info.biz;

import com.jerry.commons.StringUtil;
import com.jerry.info.vo.*;
import org.hyperic.sigar.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Jerry on 15/12/14.
 */
public class InfoProvider {
    private static final Logger logger = LoggerFactory
            .getLogger(InfoProvider.class);
    public static SysVo property() throws UnknownHostException {
        Runtime r = Runtime.getRuntime();
        SysVo sysVo = new SysVo();
        Properties props = System.getProperties();
        InetAddress addr;
        addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        Map<String, String> map = System.getenv();
        String userName = map.get("USERNAME");// 获取用户名
        String computerName = map.get("COMPUTERNAME");// 获取计算机名
        String userDomain = map.get("USERDOMAIN");// 获取计算机域名
        sysVo.setUser(userName + "");//用户名
        sysVo.setComputer_name(computerName + "");//计算机名
        sysVo.setUser_domain(userDomain + "");//计算机域名
        sysVo.setIp(ip);//本地ip地址
        sysVo.setHost_name(addr.getHostName() + "");//本地主机名
        sysVo.setTotal_memory(StringUtil.stringToLong(r.totalMemory() + ""));//JVM可以使用的总内存
        sysVo.setFree_memory(StringUtil.stringToLong(r.freeMemory() + ""));//JVM可以使用的剩余内存
        sysVo.setAvailable_processors(r.availableProcessors() + "");//JVM可以使用的处理器个数
        sysVo.setJava_version(props.getProperty("java.version") + "");//Java的运行环境版本
        sysVo.setJava_vendor(props.getProperty("java.vendor" + ""));//Java的运行环境供应商
        sysVo.setJava_vendor_url(props.getProperty("java.vendor.url") + "");//Java供应商的URL
        sysVo.setJava_home(props.getProperty("java.home") + "");//Java的安装路径
        sysVo.setJava_vm_specification_version(props.getProperty("java.vm.specification.version") + "");//Java的虚拟机规范版本
        sysVo.setJava_vm_specification_vendor(props.getProperty("java.vm.specification.vendor") + "");//Java的虚拟机规范供应商
        sysVo.setJava_vm_specification_name(props.getProperty("java.vm.specification.name") + "");//Java的虚拟机规范名称
        sysVo.setJava_vm_version(props.getProperty("java.vm.version") + "");//Java的虚拟机实现版本
        sysVo.setJava_vm_vendor(props.getProperty("java.vm.vendor") + "");//Java的虚拟机实现供应商
        sysVo.setJava_vm_name(props.getProperty("java.vm.name") + "");//Java的虚拟机实现名称
        sysVo.setJava_specification_version(props.getProperty("java.specification.version") + "");//Java运行时环境规范版本
        sysVo.setJava_specification_vender(props.getProperty("java.specification.vender") + "");//Java运行时环境规范供应商
        sysVo.setJava_specification_name(props.getProperty("java.specification.name") + "");//Java运行时环境规范名称
        sysVo.setJava_class_version(props.getProperty("java.class.version" + ""));//Java的类格式版本号
        sysVo.setJava_class_path(props.getProperty("java.class.path") + "");//Java的类路径
        sysVo.setJava_library_path(props.getProperty("java.library.path") + "");//加载库时搜索的路径列表
        sysVo.setJava_io_tmpdir(props.getProperty("java.io.tmpdir") + "");//默认的临时文件路径
        sysVo.setJava_ext_dirs(props.getProperty("java.ext.dirs") + "");//一个或多个扩展目录的路径
        sysVo.setOs_name(props.getProperty("os.name") + "");//操作系统的名称
        sysVo.setOs_arch(props.getProperty("os.arch") + "");//操作系统的构架
        sysVo.setOs_version(props.getProperty("os.version") + "");//操作系统的版本
        sysVo.setFile_separator(props.getProperty("file.separator") + "");//文件分隔符
        sysVo.setPath_separator(props.getProperty("path.separator") + "");//路径分隔符
        sysVo.setLine_separator(props.getProperty("line.separator") + "");//行分隔符
        sysVo.setUser_name(props.getProperty("user.name") + "");//用户的账户名称
        sysVo.setUser_home(props.getProperty("user.home") + "");//用户的主目录
        sysVo.setUser_dir(props.getProperty("user.dir") + "");//用户的当前工作目录
        return sysVo;
    }

    public static MemoryVo memory() throws SigarException {
        MemoryVo memoryVo = new MemoryVo();
        Sigar sigar = new Sigar();
        Mem mem = sigar.getMem();
        // 内存总量
        memoryVo.setMem_total(StringUtil.stringToLong(mem.getTotal()+""));//内存总量
        // 当前内存使用量
        memoryVo.setMem_used(StringUtil.stringToLong(mem.getUsed()+""));//当前内存使用量
        // 当前内存剩余量
        memoryVo.setMem_free(StringUtil.stringToLong(mem.getFree()+""));//当前内存剩余量
        Swap swap = sigar.getSwap();
        // 交换区总量
        memoryVo.setSwap_total(StringUtil.stringToLong(swap.getTotal()+""));//交换区总量
        // 当前交换区使用量
        memoryVo.setSwap_used(StringUtil.stringToLong(swap.getUsed()+""));//当前交换区使用量
        // 当前交换区剩余量
        memoryVo.setSwap_free(StringUtil.stringToLong(swap.getFree()+""));//当前交换区剩余量
        return memoryVo;
    }

    public static CpusVo cpu() throws SigarException {
        CpusVo cpusVo = new CpusVo();
        Sigar sigar = new Sigar();
        CpuInfo infos[] = sigar.getCpuInfoList();
        CpuPerc cpuList[] = null;
        cpuList = sigar.getCpuPercList();
        cpusVo.setNum(infos.length);
        List<CpuVo> cpuVos = new ArrayList<CpuVo>();
        for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
            CpuInfo info = infos[i];
            CpuVo cpuVo = new CpuVo();
            cpuVo.setIndex(i);//第几块cpu信息
            cpuVo.setMhz(info.getMhz() + "");//CPU的总量MHz
            cpuVo.setVendor(info.getVendor() + "");//CPU生产商 获得CPU的卖主，如：Intel
            cpuVo.setModel(info.getModel() + "");//获得CPU的类别，如：Celeron
            cpuVo.setCache_size(info.getCacheSize() + "");//CPU缓存数量 缓冲存储器数量
            CpuPercVo cpuPercVo = getCpuPerc(cpuList[i]);//获取cpu当前状况
            cpuVo.setCpuPercVo(cpuPercVo);
            cpuVos.add(cpuVo);
        }
        cpusVo.setCpuVos(cpuVos);
        return cpusVo;
    }

    private static CpuPercVo getCpuPerc(CpuPerc cpu) {
        CpuPercVo cpuPercVo = new CpuPercVo();
        cpuPercVo.setUser(CpuPerc.format(cpu.getUser()) + "");//CPU用户使用率
        cpuPercVo.setSys(CpuPerc.format(cpu.getSys()) + "");//CPU系统使用率
        cpuPercVo.setWait(CpuPerc.format(cpu.getWait()) + "");//CPU当前等待率
        cpuPercVo.setNice(CpuPerc.format(cpu.getNice()) + "");//CPU当前错误率
        cpuPercVo.setIdle(CpuPerc.format(cpu.getIdle()) + "");//CPU当前空闲率
        cpuPercVo.setCombined(CpuPerc.format(cpu.getCombined()) + "");//CPU总的使用率
        return cpuPercVo;
    }

    public static OsVo os() {
        OsVo osVo = new OsVo();
        OperatingSystem OS = OperatingSystem.getInstance();
        // 操作系统内核类型如： 386、486、586等x86
        osVo.setArch(OS.getArch() + "");//操作系统
        osVo.setCpu_endian(OS.getCpuEndian() + "");//操作系统CpuEndian
        osVo.setData_model(OS.getDataModel() + "");//操作系统DataModel
        // 系统描述
        osVo.setDescription(OS.getDescription() + "");//操作系统的描述
        // 操作系统类型
        osVo.setName(OS.getName() + "");//OS.getName()
        osVo.setPatch_level(OS.getPatchLevel() + "");//OS.getPatchLevel()
        // 操作系统的卖主
        osVo.setVendor(OS.getVendor() + "");//操作系统的卖主
        // 卖主名称
        osVo.setVendor_code_name(OS.getVendorCodeName() + "");//操作系统的卖主名
        // 操作系统名称
        osVo.setVendor_name(OS.getVendorName() + "");//操作系统名称
        // 操作系统卖主类型
        osVo.setVendor_version(OS.getVendorVersion() + "");//操作系统卖主类型
        // 操作系统的版本号
        osVo.setVersion(OS.getVersion() + "");//操作系统的版本号
        return osVo;
    }

    public static WhosVo who() throws SigarException {
        WhosVo whosVo = new WhosVo();
        Sigar sigar = new Sigar();
        Who who[] = sigar.getWhoList();
        whosVo.setNum(who.length);
        List<WhoVo>  whoVos= new ArrayList<WhoVo>();
        if (who != null && who.length > 0) {
            for (int i = 0; i < who.length; i++) {
                // System.out.println("当前系统进程表中的用户名" + String.valueOf(i));
                Who _who = who[i];
                WhoVo whoVo = new WhoVo();
                whoVo.setIndex(i);//第几个用户
                whoVo.setDevice(_who.getDevice() + "");//用户控制台
                whoVo.setHost(_who.getHost() + "");//用户host
                whoVo.setTime(_who.getTime() + "");//getTime
                // 当前系统进程表中的用户名
                whoVo.setUser(_who.getUser()+"");//当前系统进程表中的用户名
                whoVos.add(whoVo);
            }
        }
        whosVo.setWhoVos(whoVos);
        return whosVo;
    }

    public static FilesVo file() throws SigarException {
        Sigar sigar = new Sigar();
        FileSystem fslist[] = sigar.getFileSystemList();
        FilesVo filesVo = new FilesVo();
        List<FileVo> fileVos = new ArrayList<FileVo>();
        filesVo.setNum(fslist.length);
        long total_number = 0;
        for (int i = 0; i < fslist.length; i++) {
            FileVo fileVo = new FileVo();
            fileVo.setIndex(i);//分区的盘符名称 磁盘编号
            FileSystem fs = fslist[i];
            // 分区的盘符名称
            fileVo.setDev_name(fs.getDevName() + "");//盘符名称
            // 分区的盘符名称
            fileVo.setDir_name(fs.getDirName() + "");//盘符路径
            fileVo.setFlags(fs.getFlags() + "");//盘符标志
            // 文件系统类型，比如 FAT32、NTFS
            fileVo.setSys_type_name(fs.getSysTypeName() + "");//盘符类型
            // 文件系统类型名，比如本地硬盘、光驱、网络文件系统等
            fileVo.setType_name(fs.getTypeName() + "");//盘符类型名
            // 文件系统类型
            fileVo.setType(fs.getType() + "");//盘符文件系统类型
            FileSystemUsage usage = null;
            try {
                usage = sigar.getFileSystemUsage(fs.getDirName());
                switch (fs.getType()) {
                    case 0: // TYPE_UNKNOWN ：未知
                        break;
                    case 1: // TYPE_NONE
                        break;
                    case 2: // TYPE_LOCAL_DISK : 本地硬盘
                        // 文件系统总大小
                        long total = StringUtil.stringToLong(usage.getTotal() + "");
                        total_number += total;
                        fileVo.setTotal(total);//总大小 kb
                        // 文件系统剩余大小
                        fileVo.setFree(StringUtil.stringToLong(usage.getFree() + ""));//剩余大小 KB
                        // 文件系统可用大小
                        fileVo.setAvail(StringUtil.stringToLong(usage.getAvail() + ""));//可用大小 KB
                        // 文件系统已经使用量
                        fileVo.setUsed(StringUtil.stringToLong(usage.getUsed() + ""));//已经使用量 kb
                        // 文件系统资源的利用率
                        double usePercent = usage.getUsePercent() * 100D;
                        fileVo.setUse_percent(+usePercent + "%");//资源的利用率
                        break;
                    case 3:// TYPE_NETWORK ：网络
                        break;
                    case 4:// TYPE_RAM_DISK ：闪存
                        break;
                    case 5:// TYPE_CDROM ：光驱
                        break;
                    case 6:// TYPE_SWAP ：页面交换
                        break;
                }
                fileVo.setDisk_reads(StringUtil.stringToLong(usage.getDiskReads() + ""));//读出
                fileVo.setDisk_writes(StringUtil.stringToLong(usage.getDiskWrites() + ""));//写入
            } catch (SigarException e) {
                // 文件系统总大小
                long total = 0;
                total_number += 0;
                fileVo.setTotal(total);//总大小 kb
                // 文件系统剩余大小
                fileVo.setFree(0);//剩余大小 KB
                // 文件系统可用大小
                fileVo.setAvail(0);//可用大小 KB
                // 文件系统已经使用量
                fileVo.setUsed(0);//已经使用量 kb
                // 文件系统资源的利用率
                fileVo.setUse_percent(0+ "%");//资源的利用率
                fileVo.setDisk_reads(0);//读出
                fileVo.setDisk_writes(0);//写入
            }
            fileVos.add(fileVo);
        }
        filesVo.setTotal_number(total_number);
        filesVo.setFileVos(fileVos);
        return filesVo;
    }

    public static NetsVo net() throws Exception {
        Sigar sigar = new Sigar();
        NetsVo netsVo = new NetsVo();
        List<NetVo> netVos = new ArrayList<NetVo>();
        String ifNames[] = sigar.getNetInterfaceList();
        netsVo.setNum(ifNames.length);
        for (int i = 0; i < ifNames.length; i++) {
            String name = ifNames[i];
            NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name);
            NetVo netVo = new NetVo();
            netVo.setIndex(i);//编号
            netVo.setName(name + "");//网络设备名
            netVo.setAddress(ifconfig.getAddress() + "");//IP地址
            netVo.setNetmask(ifconfig.getNetmask() + "");//子网掩码
            if ((ifconfig.getFlags() & 1L) <= 0L) {
                logger.warn("!IFF_UP...skipping getNetInterfaceStat");
                continue;
            }
            NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name);
            netVo.setRxpackets(ifstat.getRxPackets() + "");//接收的总包裹数
            netVo.setTxpackets(ifstat.getTxPackets() + "");//发送的总包裹数
            netVo.setRxbytes(ifstat.getRxBytes() + "");//接收到的总字节数
            netVo.setTxbytes(ifstat.getTxBytes() + "");//发送的总字节数
            netVo.setRxerrors(ifstat.getRxErrors() + "");//接收到的错误包数
            netVo.setTxerrors(ifstat.getTxErrors() + "");//发送数据包时的错误数
            netVo.setRxdropped(ifstat.getRxDropped() + "");//接收时丢弃的包数
            netVo.setTxdropped(ifstat.getTxDropped() + "");//发送时丢弃的包数
            netVos.add(netVo);
        }
        netsVo.setNetVos(netVos);
        return netsVo;
    }

    public static EthernetsVo ethernet() throws SigarException {
        Sigar sigar = null;
        sigar = new Sigar();
        EthernetsVo ethernetsVo = new EthernetsVo();
        String[] ifaces = sigar.getNetInterfaceList();
        ethernetsVo.setNum(ifaces.length);
        List<EthernetVo> ethernetVos = new ArrayList<EthernetVo>();
        for (int i = 0; i < ifaces.length; i++) {
            NetInterfaceConfig cfg = sigar.getNetInterfaceConfig(ifaces[i]);
            EthernetVo ethernetVo = new EthernetVo();
            ethernetVo.setIndex(i);
            if (NetFlags.LOOPBACK_ADDRESS.equals(cfg.getAddress()) || (cfg.getFlags() & NetFlags.IFF_LOOPBACK) != 0
                    || NetFlags.NULL_HWADDR.equals(cfg.getHwaddr())) {
                logger.warn("!IFF_UP...skipping getEthernetInfo");
                continue;
            }
            ethernetVo.setAddress(cfg.getAddress() + "");//IP地址
            ethernetVo.setBroadcast(cfg.getBroadcast() + "");//网关广播地址
            ethernetVo.setHwaddr(cfg.getHwaddr() + "");//网卡MAC地址
            ethernetVo.setNetmask(cfg.getNetmask() + "");//子网掩码
            ethernetVo.setDescription(cfg.getDescription() + "");//网卡描述信息
            ethernetVo.setType(cfg.getType()+"");//网卡类型
            ethernetVos.add(ethernetVo);
        }
        ethernetsVo.setEthernetVos(ethernetVos);
        return ethernetsVo;
    }
}
