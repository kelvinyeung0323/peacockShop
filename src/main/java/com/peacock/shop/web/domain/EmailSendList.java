package com.peacock.shop.web.domain;

public class EmailSendList {
    private Integer id;

    private String email;

    private Integer templateId;

    private Boolean error;

    private Byte pri;

    private Integer lastSend;

    private String emailContent;

    public EmailSendList(Integer id, String email, Integer templateId, Boolean error, Byte pri, Integer lastSend, String emailContent) {
        this.id = id;
        this.email = email;
        this.templateId = templateId;
        this.error = error;
        this.pri = pri;
        this.lastSend = lastSend;
        this.emailContent = emailContent;
    }

    public EmailSendList() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Byte getPri() {
        return pri;
    }

    public void setPri(Byte pri) {
        this.pri = pri;
    }

    public Integer getLastSend() {
        return lastSend;
    }

    public void setLastSend(Integer lastSend) {
        this.lastSend = lastSend;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }
}