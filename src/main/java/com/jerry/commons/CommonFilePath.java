package com.jerry.commons;

/**
 * Created by Jerry on 15/12/15.
 */
public class CommonFilePath {
    private static String base_path = "";
    static{
        base_path = StringUtil.subFilPath(GetRootPath.getRootPath());
    }
    public static String SWF_PATH = base_path + "/main.swf";
    public static String JAR_PATH = base_path + "/WEB-INF/lib/encrypt.jar";
    public static String KEY_NAME = "key.txt";
    public static String LICENCE_NAME = "LICENCE.txt";


}
