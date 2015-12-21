package com.jerry.commons;

import org.hyperic.sigar.Sigar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jerry on 15/12/10.
 */
public class SigarUtil {

    public final static Sigar sigar = initSigar();
    private static final Logger logger = LoggerFactory
            .getLogger(SigarUtil.class);

    public static Sigar initSigar() {
        try {

            String filePath = GetRootPath.getFilePath("sigar/.sigar_shellrc");

            String path = System.getProperty("java.library.path");
            if (OsCheck.getOperatingSystemType() == OsCheck.OSType.Windows) {
                path += ";" + filePath;
            } else {
                path += ":" + filePath;
            }
            System.setProperty("java.library.path", path);

            return new Sigar();

        } catch (Exception e) {
            logger.error("SigarUtil 添加sigar包到java.library.path错误", e);
            return null;
        }
    }
}
