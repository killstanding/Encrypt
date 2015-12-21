package com.jerry.service;

import com.jerry.commons.CommonFilePath;
import com.jerry.commons.SigarUtil;
import com.jerry.commons.StringUtil;
import com.jerry.commons.TxtUtil;
import com.jerry.handler.DataHanler;
import org.hyperic.sigar.SigarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jerry on 15/12/17.
 */
public class KeyService {
    private static final Logger logger = LoggerFactory
            .getLogger(KeyService.class);

    /**
     * 从 key.txt中获取 orKey, 然后生成licence, 写回源文件
     * return 新文件名称
     */
    private static String getLicenceKey(){
         String fileName = CommonFilePath.KEY_NAME;
         List<String> strings = TxtUtil.readTxt(fileName);
         String orKey = null;
         if(strings != null && strings.size() >1)orKey = strings.get(0);
         String licence = "";
         String newFileName = "";
         if(!StringUtil.isEmpty(orKey)) {
             try {
                 licence = DataHanler.getProjectLisence(orKey);
             } catch (SigarException e) {
                 logger.error("get Liscence error", e);
                 e.printStackTrace();
             }
             List<String> outStrings = new ArrayList<String>();
             outStrings.add("key = " + orKey);
             outStrings.add("licence = " + licence);
             newFileName = fileName + new Date().getTime();
             TxtUtil.writerTxt(outStrings, fileName, newFileName);

         }
         return newFileName;
     }

    /**
     *计算文件md5 存放到新文件中
     * @return 新文件名称
     */
    private static String getFileMD5(){
        String fileName = CommonFilePath.KEY_NAME;
        List<String> strings = TxtUtil.readTxt(fileName);
        String orKey = null;
        if(strings != null && strings.size() >1)orKey = strings.get(0);
        int c = StringUtil.stringToInt(orKey.substring(0, 1));
        String swfMd5 = DataHanler.getFileMD5(c * 10 + 1);

        String jarMd5 = DataHanler.getFileMD5(c*10 + 2);
        List<String> outStrings = new ArrayList<String>();
        outStrings.add("code1 = " + swfMd5);
        outStrings.add("code2 = " + jarMd5);
        String newFileName = CommonFilePath.LICENCE_NAME + new Date().getTime();
        TxtUtil.writerTxt(outStrings, fileName, newFileName);
        return newFileName;
    }

    private static  void calc(){
        System.out.println("输入 1:计算licence； 输入 2:计算文件MD5");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        int type = 0;
        try {
            type = StringUtil.stringToInt(read);
        } catch (ClassCastException e) {
            type = 0;
        }
        String filename = "";
        switch (type){
            case 1:
                filename = getLicenceKey();
                System.out.println("请到文件" + filename + "中查看结果");
                break;
            case 2:
                filename = getFileMD5();
                System.out.println("请到文件" + filename + "中查看结果");
                break;
            default:
                System.out.println("输入错误");
                calc();
                break;
        }
    }
    public static void main(String[] args) {
        SigarUtil.initSigar();
        System.out.println("欢迎进入加密工具助手");
        calc();
    }

}
