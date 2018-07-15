package com.peacock.shop.web.domain;

public class ErrorLog {
    private Integer id;

    private String info;

    private String file;

    private Integer time;

    public ErrorLog(Integer id, String info, String file, Integer time) {
        this.id = id;
        this.info = info;
        this.file = file;
        this.time = time;
    }

    public ErrorLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}