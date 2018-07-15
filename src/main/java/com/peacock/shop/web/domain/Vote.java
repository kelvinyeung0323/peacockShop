package com.peacock.shop.web.domain;

public class Vote {
    private Short voteId;

    private String voteName;

    private Integer startTime;

    private Integer endTime;

    private Boolean canMulti;

    private Integer voteCount;

    public Vote(Short voteId, String voteName, Integer startTime, Integer endTime, Boolean canMulti, Integer voteCount) {
        this.voteId = voteId;
        this.voteName = voteName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.canMulti = canMulti;
        this.voteCount = voteCount;
    }

    public Vote() {
        super();
    }

    public Short getVoteId() {
        return voteId;
    }

    public void setVoteId(Short voteId) {
        this.voteId = voteId;
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName == null ? null : voteName.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Boolean getCanMulti() {
        return canMulti;
    }

    public void setCanMulti(Boolean canMulti) {
        this.canMulti = canMulti;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}