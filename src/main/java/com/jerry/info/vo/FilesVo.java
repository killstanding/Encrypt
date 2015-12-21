package com.jerry.info.vo;

import java.util.List;

/**
 * Created by Jerry on 15/12/14.
 */
public class FilesVo {
    private int num;// 有多少个盘
    private long  total_number;//总容量
    private List<FileVo> fileVos;//磁盘具体信息

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getTotal_number() {
        return total_number;
    }

    public void setTotal_number(long total_number) {
        this.total_number = total_number;
    }

    public List<FileVo> getFileVos() {
        return fileVos;
    }

    public void setFileVos(List<FileVo> fileVos) {
        this.fileVos = fileVos;
    }

    @Override
    public String toString() {
        return "FilesVo{" +
                "num=" + num +
                ", total_number=" + total_number +
                ", fileVos=" + fileVos +
                '}';
    }
}
