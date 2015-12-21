package com.jerry.handler;

import com.jerry.commons.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Jerry on 15/12/15.
 */
public class CheckInfo {
    private static final Logger logger = LoggerFactory
            .getLogger(CheckInfo.class);

    /**
     * 检验文件md5
     * @param c md5循环次数
     * @return 是否没有问题
     */
    public static  boolean checkFileMD5(int c) throws IOException{
        boolean result = true;
        String swfMd5 = DataHanler.getFileMD5(c*10 + 1);
        String swfMd5P = PropertiesUtil.getInstance().getProperty("code1");
        //logger.info("swfMd5 = " +swfMd5+ ",swfMd5P = " +swfMd5P);
        if(!swfMd5.equals(swfMd5P)) result = false;

        String jarMd5 = DataHanler.getFileMD5(c*10 + 2);
        String jarMd5P = PropertiesUtil.getInstance().getProperty("code2");
        //logger.info("jarMd5 = " +jarMd5+ ",jarMd5P = " +jarMd5P);
        if(!jarMd5.equals(jarMd5P)) result = false;
        return result;
    };

}
