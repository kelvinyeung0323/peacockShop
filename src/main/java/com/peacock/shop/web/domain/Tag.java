package com.peacock.shop.web.domain;

public class Tag {
    private Integer tagId;

    private Integer userId;

    private Integer goodsId;

    private String tagWords;

    public Tag(Integer tagId, Integer userId, Integer goodsId, String tagWords) {
        this.tagId = tagId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.tagWords = tagWords;
    }

    public Tag() {
        super();
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTagWords() {
        return tagWords;
    }

    public void setTagWords(String tagWords) {
        this.tagWords = tagWords == null ? null : tagWords.trim();
    }
}