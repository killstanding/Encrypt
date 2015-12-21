package com.jerry.commons;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jerry on 15/12/15.
 */
public class GetRootPathTest {
    private static final Logger logger = LoggerFactory
            .getLogger(GetRootPathTest.class);
    @Test
    public void test(){
        logger.info(GetRootPath.getRootPath());
    }
}
