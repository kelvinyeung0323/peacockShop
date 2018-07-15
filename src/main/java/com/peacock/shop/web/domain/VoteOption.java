package com.peacock.shop.web.domain;

public class VoteOption {
    private Short optionId;

    private Short voteId;

    private String optionName;

    private Integer optionCount;

    private Byte optionOrder;

    public VoteOption(Short optionId, Short voteId, String optionName, Integer optionCount, Byte optionOrder) {
        this.optionId = optionId;
        this.voteId = voteId;
        this.optionName = optionName;
        this.optionCount = optionCount;
        this.optionOrder = optionOrder;
    }

    public VoteOption() {
        super();
    }

    public Short getOptionId() {
        return optionId;
    }

    public void setOptionId(Short optionId) {
        this.optionId = optionId;
    }

    public Short getVoteId() {
        return voteId;
    }

    public void setVoteId(Short voteId) {
        this.voteId = voteId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public Integer getOptionCount() {
        return optionCount;
    }

    public void setOptionCount(Integer optionCount) {
        this.optionCount = optionCount;
    }

    public Byte getOptionOrder() {
        return optionOrder;
    }

    public void setOptionOrder(Byte optionOrder) {
        this.optionOrder = optionOrder;
    }
}