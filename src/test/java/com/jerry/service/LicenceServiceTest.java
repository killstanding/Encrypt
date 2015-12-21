package com.jerry.service;

import com.jerry.TestBase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jerry on 15/12/18.
 */
public class LicenceServiceTest extends TestBase{
    private static final Logger logger = LoggerFactory
            .getLogger(LicenceServiceTest.class);

    private static  String  key = "3www.metarnet.com";
    private static  String licence = "3069cf199b10be9264c5a263ee9537e12";
    @Test
    public void testGetProjectLicence(){

        String newLicence = new LicenceService().getProjectLicence(key);
        logger.info("newLicence = " + newLicence);
        if(newLicence.equals(licence)) logger.info("newLicence == licence");

    }
}
