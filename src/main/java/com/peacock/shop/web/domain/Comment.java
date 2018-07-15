package com.peacock.shop.web.domain;

public class Comment {
    private Integer commentId;

    private Byte commentType;

    private Integer idValue;

    private String email;

    private String userName;

    private Byte commentRank;

    private Integer addTime;

    private String ipAddress;

    private Byte status;

    private Integer parentId;

    private Integer userId;

    private String content;

    public Comment(Integer commentId, Byte commentType, Integer idValue, String email, String userName, Byte commentRank, Integer addTime, String ipAddress, Byte status, Integer parentId, Integer userId, String content) {
        this.commentId = commentId;
        this.commentType = commentType;
        this.idValue = idValue;
        this.email = email;
        this.userName = userName;
        this.commentRank = commentRank;
        this.addTime = addTime;
        this.ipAddress = ipAddress;
        this.status = status;
        this.parentId = parentId;
        this.userId = userId;
        this.content = content;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Byte getCommentType() {
        return commentType;
    }

    public void setCommentType(Byte commentType) {
        this.commentType = commentType;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getCommentRank() {
        return commentRank;
    }

    public void setCommentRank(Byte commentRank) {
        this.commentRank = commentRank;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}