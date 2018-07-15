package com.peacock.shop.web.domain;

import java.util.Date;

public class Push {
    private Integer id;

    private Integer userId;

    private String title;

    private String content;

    private String photo;

    private String objectid;

    private String link;

    private Byte platform;

    private Byte pushType;

    private Byte messageType;

    private Byte ispush;

    private Date pushAt;

    private Byte status;

    private Date createdAt;

    private Date updatedAt;

    public Push(Integer id, Integer userId, String title, String content, String photo, String objectid, String link, Byte platform, Byte pushType, Byte messageType, Byte ispush, Date pushAt, Byte status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.photo = photo;
        this.objectid = objectid;
        this.link = link;
        this.platform = platform;
        this.pushType = pushType;
        this.messageType = messageType;
        this.ispush = ispush;
        this.pushAt = pushAt;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Push() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid == null ? null : objectid.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Byte getPlatform() {
        return platform;
    }

    public void setPlatform(Byte platform) {
        this.platform = platform;
    }

    public Byte getPushType() {
        return pushType;
    }

    public void setPushType(Byte pushType) {
        this.pushType = pushType;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public Byte getIspush() {
        return ispush;
    }

    public void setIspush(Byte ispush) {
        this.ispush = ispush;
    }

    public Date getPushAt() {
        return pushAt;
    }

    public void setPushAt(Date pushAt) {
        this.pushAt = pushAt;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}