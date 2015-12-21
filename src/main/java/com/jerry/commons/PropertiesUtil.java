package com.jerry.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Jerry on 15/12/15.
 */
public class PropertiesUtil {

    private static PropertiesUtil propertiesUtil = null;
    private Properties p = new Properties();
    private PropertiesUtil() throws IOException{
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(CommonFilePath.LICENCE_NAME);
        p.load(inputStream);
    }

    public static PropertiesUtil getInstance() throws  IOException{
        if(propertiesUtil == null ) propertiesUtil = new PropertiesUtil();
        return propertiesUtil;
    }

    /**
     *
     * @param key code1:项目code;   code2:swf md5; code3: jar md5
     * @return
     */
    public String getProperty(String key){

        return p.getProperty(key);
    }

}
