package com.peacock.shop.web.domain;

public class UserFeed {
    private Integer feedId;

    private Integer userId;

    private Integer valueId;

    private Integer goodsId;

    private Boolean feedType;

    private Boolean isFeed;

    public UserFeed(Integer feedId, Integer userId, Integer valueId, Integer goodsId, Boolean feedType, Boolean isFeed) {
        this.feedId = feedId;
        this.userId = userId;
        this.valueId = valueId;
        this.goodsId = goodsId;
        this.feedType = feedType;
        this.isFeed = isFeed;
    }

    public UserFeed() {
        super();
    }

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getFeedType() {
        return feedType;
    }

    public void setFeedType(Boolean feedType) {
        this.feedType = feedType;
    }

    public Boolean getIsFeed() {
        return isFeed;
    }

    public void setIsFeed(Boolean isFeed) {
        this.isFeed = isFeed;
    }
}