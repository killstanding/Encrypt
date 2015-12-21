package com.jerry.info.biz;

import com.jerry.TestBase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jerry on 15/12/14.
 */
public class InfoProviderTest extends TestBase {
    private static final Logger logger = LoggerFactory
            .getLogger(InfoProviderTest.class);

    @Test
    public void runTimeTest() {

        try {
            // System信息，从jvm获取
            logger.info(InfoProvider.property().toString());
            logger.info("----------------------------------");
            // cpu信息
            logger.info(InfoProvider.cpu().toString());
            logger.info("----------------------------------");
            // 内存信息
            logger.info(InfoProvider.memory().toString());
            logger.info("----------------------------------");
            // 操作系统信息
            logger.info(InfoProvider.os().toString());
            logger.info("----------------------------------");
            // 用户信息
            logger.info(InfoProvider.who().toString());
            logger.info("----------------------------------");
            // 文件系统信息
            logger.info(InfoProvider.file().toString());
            logger.info("----------------------------------");
            // 网络信息
            logger.info(InfoProvider.net().toString());
            logger.info("----------------------------------");
            // 以太网信息
            logger.info(InfoProvider.ethernet().toString());
            logger.info("----------------------------------");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
