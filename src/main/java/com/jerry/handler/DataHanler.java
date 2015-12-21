package com.jerry.handler;

import com.jerry.commons.CommonFilePath;
import com.jerry.commons.StringUtil;
import com.jerry.encrypt.FileMD5Util;
import com.jerry.info.biz.InfoProvider;
import com.jerry.info.vo.*;
import org.hyperic.sigar.SigarException;

import java.io.File;

/**
 * Created by Jerry on 15/12/15.
 */
public class DataHanler {

    /**
     * 获取文件MD5
     *
     * @param orType 10位为MD5运行次数， 个位为type :1 swf 2 jar
     * @return
     */
    public static String getFileMD5(int orType) {
        int c = orType / 10;
        int type = orType % 10;
        String result = "";
        String path = "";
        switch (type) {
            case 1:
                path = CommonFilePath.SWF_PATH;
                break;
            case 2:
                path = CommonFilePath.JAR_PATH;
                break;
        }
        result = FileMD5Util.getFileMD5String(new File(path));
        for (int i = 0; i < c - 1; i++) {
            result = FileMD5Util.MD5(result);
        }
        return result;
    }

    /**
     * 根据服务器信息获取唯一lisence
     *
     * @param orKey orKey第一位为MD5运行次数， 后面为关键key
     * @return
     */
    public static String getProjectLisence(String orKey) throws SigarException {
        int c = StringUtil.stringToInt(orKey.substring(0, 1));
        String key = orKey.substring(1);
        String info = getInfo(key);

        String l = FileMD5Util.MD5(info);
        for (int i = 0; i < c - 1; i++) {
            l = FileMD5Util.MD5(l);
        }
        return c + l;
    }

    /**
     * 获取 cpu 硬盘 内存 Hwaddr
     *
     * @return
     */
    private static String getInfo(String key) throws SigarException {
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        //cpu 信息
        CpusVo cpus = InfoProvider.cpu();
        sb.append(cpus.getNum());
        CpuVo cpu = null;
        if (cpus.getCpuVos() != null && cpus.getCpuVos().size() > 1) cpu = cpus.getCpuVos().get(0);
        sb.append(cpu.getVendor());
        sb.append(cpu.getModel());
        sb.append(cpu.getMhz());
        sb.append(cpu.getCache_size());
        //内存信息
        MemoryVo m = InfoProvider.memory();
        sb.append(m.getMem_total());
        //磁盘信息
        FilesVo files = InfoProvider.file();
        sb.append(files.getTotal_number());
        //以太网口
        EthernetsVo eths = InfoProvider.ethernet();
        sb.append(eths.getNum());
        for (int i = 0; i < eths.getEthernetVos().size(); i++) {
            EthernetVo e = eths.getEthernetVos().get(i);
            sb.append(e.getHwaddr());
        }
        return sb.toString();

    }
}
