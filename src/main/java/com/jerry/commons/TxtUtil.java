package com.jerry.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 15/12/17.
 */
public class TxtUtil {
    private static final Logger logger = LoggerFactory
            .getLogger(TxtUtil.class);
    private static String CHARACTER_SET = "UTF-8";

    /**
     * 写文件
     *
     * @param strings  写入的数据，按行输入
     * @param fileName 文件名字
     */
    public static void writerTxt(List<String> strings, String fileName, String newFileName) {
        BufferedWriter fw = null;
        try {
            String filePath =   GetRootPath.getFilePath(fileName) + "/" + newFileName;
            File file = new File(filePath);
            fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), CHARACTER_SET)); // 指定编码格式，以免读取时中文字符异常
            for (int i = 0; i < strings.size(); i++) {
                fw.append(strings.get(i));
                fw.newLine();
            }
            fw.flush(); // 全部写入缓存中的内容
        } catch (Exception e) {
            logger.error("writerTxt error", e);
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    logger.error("Close IO error", e);
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 读文件
     *
     * @param fileName 文件名称
     * @return 文件内容 按行输出
     */
    public static List<String> readTxt(String fileName) {
        BufferedReader reader = null;
        List<String> strings = new ArrayList<String>();
        try {
            String filePath =   GetRootPath.getFile(fileName);
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), CHARACTER_SET)); // 指定读取文件的编码格式，要和写入的格式一致，以免出现中文乱码,
            String str = null;
            while ((str = reader.readLine()) != null) {
                strings.add(str);
            }
        } catch (FileNotFoundException e) {
            logger.error("file not found", e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("IO error", e);
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                logger.error("Close IO error", e);
                e.printStackTrace();
            }
        }
        return strings;
    }

}
