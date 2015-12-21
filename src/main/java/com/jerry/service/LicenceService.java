package com.jerry.service;

import com.jerry.handler.Init;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jerry.validate.IValidate;
import com.jerry.validate.Validate;
import com.jerry.validate.ValidateProxy;

/**
 * Created by Jerry on 15/12/15.
 */
public class LicenceService {
    private static final Logger logger = LoggerFactory
            .getLogger(LicenceService.class);

    public String getProjectLicence(String key){

        IValidate iValidate = new ValidateProxy(new Validate());
        String result = null;
        try {
            Init.getInstance();
            result = iValidate.getProjectLicence(key);
        } catch (Exception e) {
            logger.error("getProjectLicence fail", e);
            result = null;
        }
        return result;
    }
}
