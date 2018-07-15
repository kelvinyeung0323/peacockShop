package com.peacock.shop.web.domain;

public class AdminMessage {
    private Short messageId;

    private Byte senderId;

    private Byte receiverId;

    private Integer sentTime;

    private Integer readTime;

    private Boolean readed;

    private Boolean deleted;

    private String title;

    private String message;

    public AdminMessage(Short messageId, Byte senderId, Byte receiverId, Integer sentTime, Integer readTime, Boolean readed, Boolean deleted, String title, String message) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.sentTime = sentTime;
        this.readTime = readTime;
        this.readed = readed;
        this.deleted = deleted;
        this.title = title;
        this.message = message;
    }

    public AdminMessage() {
        super();
    }

    public Short getMessageId() {
        return messageId;
    }

    public void setMessageId(Short messageId) {
        this.messageId = messageId;
    }

    public Byte getSenderId() {
        return senderId;
    }

    public void setSenderId(Byte senderId) {
        this.senderId = senderId;
    }

    public Byte getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Byte receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getSentTime() {
        return sentTime;
    }

    public void setSentTime(Integer sentTime) {
        this.sentTime = sentTime;
    }

    public Integer getReadTime() {
        return readTime;
    }

    public void setReadTime(Integer readTime) {
        this.readTime = readTime;
    }

    public Boolean getReaded() {
        return readed;
    }

    public void setReaded(Boolean readed) {
        this.readed = readed;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}