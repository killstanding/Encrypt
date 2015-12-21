package com.jerry.commons;


import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;

public class GetRootPath {

	/***
	 * 获得根路径
	 * @return
	 */
	public String getRtPath(){
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().toString();
		if(path.indexOf("WEB-INF")>0){
			path = path.substring(0, path.indexOf("/WEB-INF"));
		}else if(path.indexOf("target")>0){
            path = path.substring(0, path.indexOf("target") + 6);
        }else if(!getClass().getPackage().getName().equals("")){
			path = path.substring(0, path.indexOf(getClass().getPackage().getName().replace(".", "/"))-1);
		}else{
			path = path.substring(0, path.lastIndexOf("/"));
		}
		
		return path;
	}
	
	/***
	 * 获得根路径
	 * @return
	 */
	public static String getRootPath(){
		return new GetRootPath().getRtPath();
	}

    public static String getFilePath(String filename) throws IOException{
        String file = Resources.getResource(filename).getFile();
        File classPath = new File(file).getParentFile();
        return classPath.getCanonicalPath();
    }

    public static String getFile(String filename) throws IOException{
        return Resources.getResource(filename).getFile();
    }
}
