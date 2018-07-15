package com.peacock.shop.web.domain;

public class Cron {
    private Byte cronId;

    private String cronCode;

    private String cronName;

    private Byte cronOrder;

    private Integer thistime;

    private Integer nextime;

    private Byte day;

    private String week;

    private String hour;

    private String minute;

    private Boolean enable;

    private Boolean runOnce;

    private String allowIp;

    private String alowFiles;

    public Cron(Byte cronId, String cronCode, String cronName, Byte cronOrder, Integer thistime, Integer nextime, Byte day, String week, String hour, String minute, Boolean enable, Boolean runOnce, String allowIp, String alowFiles) {
        this.cronId = cronId;
        this.cronCode = cronCode;
        this.cronName = cronName;
        this.cronOrder = cronOrder;
        this.thistime = thistime;
        this.nextime = nextime;
        this.day = day;
        this.week = week;
        this.hour = hour;
        this.minute = minute;
        this.enable = enable;
        this.runOnce = runOnce;
        this.allowIp = allowIp;
        this.alowFiles = alowFiles;
    }

    public Cron() {
        super();
    }

    public Byte getCronId() {
        return cronId;
    }

    public void setCronId(Byte cronId) {
        this.cronId = cronId;
    }

    public String getCronCode() {
        return cronCode;
    }

    public void setCronCode(String cronCode) {
        this.cronCode = cronCode == null ? null : cronCode.trim();
    }

    public String getCronName() {
        return cronName;
    }

    public void setCronName(String cronName) {
        this.cronName = cronName == null ? null : cronName.trim();
    }

    public Byte getCronOrder() {
        return cronOrder;
    }

    public void setCronOrder(Byte cronOrder) {
        this.cronOrder = cronOrder;
    }

    public Integer getThistime() {
        return thistime;
    }

    public void setThistime(Integer thistime) {
        this.thistime = thistime;
    }

    public Integer getNextime() {
        return nextime;
    }

    public void setNextime(Integer nextime) {
        this.nextime = nextime;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute == null ? null : minute.trim();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getRunOnce() {
        return runOnce;
    }

    public void setRunOnce(Boolean runOnce) {
        this.runOnce = runOnce;
    }

    public String getAllowIp() {
        return allowIp;
    }

    public void setAllowIp(String allowIp) {
        this.allowIp = allowIp == null ? null : allowIp.trim();
    }

    public String getAlowFiles() {
        return alowFiles;
    }

    public void setAlowFiles(String alowFiles) {
        this.alowFiles = alowFiles == null ? null : alowFiles.trim();
    }
}