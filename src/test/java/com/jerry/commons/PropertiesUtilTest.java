package com.jerry.commons;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Jerry on 15/12/15.
 */
public class PropertiesUtilTest {
    private static final Logger logger = LoggerFactory
            .getLogger(PropertiesUtilTest.class);

    @Test
    public void getProperty() throws IOException{
        PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
        logger.info("code1 = " + propertiesUtil.getProperty("code1"));

    }

}
