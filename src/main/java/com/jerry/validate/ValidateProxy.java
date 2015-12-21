package com.jerry.validate;


import com.jerry.commons.StringUtil;
import com.jerry.handler.CheckInfo;

/**
 * Created by Jerry on 15/12/15.
 */
public class ValidateProxy implements IValidate {

    private IValidate iValidate;
    public  ValidateProxy(IValidate iValidate){
        this.iValidate = iValidate;
    }

    @Override
    public String getProjectLicence(String orKey) throws Exception {
        int c = StringUtil.stringToInt(orKey.substring(0, 1));
        if(CheckInfo.checkFileMD5(c)) return iValidate.getProjectLicence(orKey);
        return null;
    }
}
