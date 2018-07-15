package com.peacock.shop.web.domain;

public class RegExtendInfo {
    private Integer id;

    private Integer userId;

    private Integer regFieldId;

    private String content;

    public RegExtendInfo(Integer id, Integer userId, Integer regFieldId, String content) {
        this.id = id;
        this.userId = userId;
        this.regFieldId = regFieldId;
        this.content = content;
    }

    public RegExtendInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRegFieldId() {
        return regFieldId;
    }

    public void setRegFieldId(Integer regFieldId) {
        this.regFieldId = regFieldId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}