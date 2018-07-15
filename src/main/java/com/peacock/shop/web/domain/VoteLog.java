package com.peacock.shop.web.domain;

public class VoteLog {
    private Integer logId;

    private Short voteId;

    private String ipAddress;

    private Integer voteTime;

    public VoteLog(Integer logId, Short voteId, String ipAddress, Integer voteTime) {
        this.logId = logId;
        this.voteId = voteId;
        this.ipAddress = ipAddress;
        this.voteTime = voteTime;
    }

    public VoteLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Short getVoteId() {
        return voteId;
    }

    public void setVoteId(Short voteId) {
        this.voteId = voteId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Integer getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(Integer voteTime) {
        this.voteTime = voteTime;
    }
}