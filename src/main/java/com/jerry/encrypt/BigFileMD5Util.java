package com.jerry.encrypt;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 大文件MD5工具
 * Created by Jerry on 15/12/9.
 */
public class BigFileMD5Util {

    private static final Logger logger = LoggerFactory
            .getLogger(BigFileMD5Util.class);

    static MessageDigest MD5 = null;
    static {
        try {
            MD5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            logger.error("BigFileMD5Util MessageDigest 初始化失败", e);
        }
    }


    /**
     * 对一个文件获取md5值
     * @return md5串
     */
    public static String getBigFileMD5String(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                MD5.update(buffer, 0, length);
            }
            return new String(Hex.encodeHex(MD5.digest()));
        } catch (FileNotFoundException e) {
            logger.error("BigFileMD5Util getBigFileMD5String  找不到文件", e);
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            logger.error("BigFileMD5Util getBigFileMD5String  流错误", e);
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                logger.error("BigFileMD5Util getBigFileMD5String  关闭流错误", e);
                e.printStackTrace();
            }
        }
    }


    /**
     * 求一个字符串的md5值
     * @param target 字符串
     * @return md5 value
     */
    public static String MD5(String target) {
        return DigestUtils.md5Hex(target);
    }
}
