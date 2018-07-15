package com.peacock.shop.web.domain;

public class CallbackStatus {
    private Long id;

    private String msgId;

    private String type;

    private String status;

    private String typeId;

    private Integer dateTime;

    private String disabled;

    private Byte times;

    private String method;

    private String httpType;

    private String data;

    public CallbackStatus(Long id, String msgId, String type, String status, String typeId, Integer dateTime, String disabled, Byte times, String method, String httpType, String data) {
        this.id = id;
        this.msgId = msgId;
        this.type = type;
        this.status = status;
        this.typeId = typeId;
        this.dateTime = dateTime;
        this.disabled = disabled;
        this.times = times;
        this.method = method;
        this.httpType = httpType;
        this.data = data;
    }

    public CallbackStatus() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Integer getDateTime() {
        return dateTime;
    }

    public void setDateTime(Integer dateTime) {
        this.dateTime = dateTime;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled == null ? null : disabled.trim();
    }

    public Byte getTimes() {
        return times;
    }

    public void setTimes(Byte times) {
        this.times = times;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getHttpType() {
        return httpType;
    }

    public void setHttpType(String httpType) {
        this.httpType = httpType == null ? null : httpType.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}