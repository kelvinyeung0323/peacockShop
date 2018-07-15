package com.peacock.shop.web.domain;

public class AdminLog {
    private Integer logId;

    private Integer logTime;

    private Byte userId;

    private String logInfo;

    private String ipAddress;

    public AdminLog(Integer logId, Integer logTime, Byte userId, String logInfo, String ipAddress) {
        this.logId = logId;
        this.logTime = logTime;
        this.userId = userId;
        this.logInfo = logInfo;
        this.ipAddress = ipAddress;
    }

    public AdminLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    public Byte getUserId() {
        return userId;
    }

    public void setUserId(Byte userId) {
        this.userId = userId;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }
}