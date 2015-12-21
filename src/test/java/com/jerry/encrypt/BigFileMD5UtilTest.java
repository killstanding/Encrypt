package com.jerry.encrypt;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jerry on 15/12/9.
 */
public class BigFileMD5UtilTest {
    @Test
    public void testGetBigFileMD5String() throws IOException {
        long begin = System.currentTimeMillis();
        File big = new File("/Users/KILLSTANDING/Downloads/testfile.docx");
        String md5 = BigFileMD5Util.getBigFileMD5String(big);
        long end = System.currentTimeMillis();
        System.out.println("md5:" + md5);
        System.out.println("time:" + ((end - begin) / 1000) + "s");
        String md5key = "08544f37e2d5b281ffc0116552db3260";
        if(md5key.equals(md5)) System.out.println("md5key = md5 is true");
    }
}
