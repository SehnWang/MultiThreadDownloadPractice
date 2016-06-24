package com.xhao.download.entity;

import java.io.Serializable;

/**
 * 下载文件信息类
 * Created by doco on 2016/6/24.
 */
public class FileInfo implements Serializable{
    private int id;
    private String fileName;
    private String url;
    private int fileSize;
    private int progressed;

    public FileInfo(int id, String fileName, String url, int fileSize, int progressed) {
        this.id = id;
        this.fileName = fileName;
        this.url = url;
        this.fileSize = fileSize;
        this.progressed = progressed;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getProgressed() {
        return progressed;
    }

    public void setProgressed(int progressed) {
        this.progressed = progressed;
    }


    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                ", fileSize=" + fileSize +
                ", progressed=" + progressed +
                '}';
    }
}
