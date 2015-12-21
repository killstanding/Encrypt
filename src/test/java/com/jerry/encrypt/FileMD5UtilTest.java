package com.jerry.encrypt;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jerry on 15/12/9.
 */
public class FileMD5UtilTest {
    @Test
    public void testGetFileMD5String() throws IOException {
        long begin = System.currentTimeMillis();
        File big = new File("/Users/KILLSTANDING/Downloads/testfile.docx");
        //File big = new File("file:/Users/KILLSTANDING/apache-tomcat-6.0.44_flex/webapps/Test/main.swf");
        String md5 = FileMD5Util.getFileMD5String(big);
        long end = System.currentTimeMillis();
        System.out.println("MD5:"+md5+"\ntime:"+((begin-end)/1000)+"s");
    }
}
