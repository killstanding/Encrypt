package com.jerry.encrypt;

/**
 * Created by Jerry on 15/12/9.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileMD5Util {
    private static final Logger logger = LoggerFactory
            .getLogger(FileMD5Util.class);
    protected static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    protected static MessageDigest messagedigest = null;
    static {
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            logger.error("FileMD5Util MessageDigest 初始化失败", e);
        }
    }

    public static String getFileMD5String(File file){
        FileInputStream in = null;
        try {
             in= new FileInputStream(file);
            FileChannel ch = in.getChannel();
            MappedByteBuffer byteBuffer = ch.map(FileChannel.MapMode.READ_ONLY, 0,
                    file.length());
            messagedigest.update(byteBuffer);
        } catch (FileNotFoundException e) {
            logger.error("FileMD5Util getFileMD5String  找不到文件", e);
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            logger.error("FileMD5Util getFileMD5String  流错误", e);
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                logger.error("FileMD5Util getFileMD5String  关闭流错误", e);
            }
        }

        return bufferToHex(messagedigest.digest());
    }

    public static String MD5(String s) {
        return MD5(s.getBytes());
    }

    public static String MD5(byte[] bytes) {
        messagedigest.update(bytes);
        return bufferToHex(messagedigest.digest());
    }

    private static String bufferToHex(byte bytes[]) {
        return bufferToHex(bytes, 0, bytes.length);
    }

    private static String bufferToHex(byte bytes[], int m, int n) {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }

    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {
        char c0 = hexDigits[(bt & 0xf0) >> 4];
        char c1 = hexDigits[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }

}