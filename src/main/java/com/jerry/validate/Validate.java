package com.jerry.validate;

import com.jerry.handler.DataHanler;

/**
 * Created by Jerry on 15/12/15.
 */
public class Validate implements IValidate{

    @Override
    public String getProjectLicence(String orKey) throws Exception{

        return DataHanler.getProjectLisence(orKey);
    }
}
