package com.jerry.info.biz;

import com.jerry.TestBase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jerry on 15/12/14.
 */
public class InfoProvider_bakTest extends TestBase{
    private static final Logger logger = LoggerFactory
            .getLogger(InfoProvider.class);
    @Test
    public void runTimeTest(){

        try {
            // System信息，从jvm获取
            InfoProvider_bak.property();
            System.out.println("----------------------------------");
            // cpu信息
            InfoProvider_bak.cpu();
            System.out.println("----------------------------------");
            // 内存信息
            InfoProvider_bak.memory(); //8388608K
            System.out.println("----------------------------------");
            // 操作系统信息
            InfoProvider_bak.os();
            System.out.println("----------------------------------");
            // 用户信息
            InfoProvider_bak.who();
            System.out.println("----------------------------------");
            // 文件系统信息
            InfoProvider_bak.file();//243915264KB
            System.out.println("----------------------------------");
            // 网络信息
            InfoProvider_bak.net();
            System.out.println("----------------------------------");
            // 以太网信息
            InfoProvider_bak.ethernet();
            System.out.println("----------------------------------");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
