package com.jerry.handler;

import com.jerry.commons.PropertiesUtil;
import com.jerry.commons.SigarUtil;

import java.io.IOException;

/**
 * Created by Jerry on 15/12/15.
 */
public class Init {

    private static Init init = null;

    private Init() throws  IOException{
        SigarUtil.initSigar();
        PropertiesUtil.getInstance();
    }
    public static Init getInstance() throws IOException {
        if(init == null ) init = new Init();
        return init;
    }
}
