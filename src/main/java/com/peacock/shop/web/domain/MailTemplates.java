package com.peacock.shop.web.domain;

public class MailTemplates {
    private Boolean templateId;

    private String templateCode;

    private Boolean isHtml;

    private String templateSubject;

    private Integer lastModify;

    private Integer lastSend;

    private String type;

    private String templateContent;

    public MailTemplates(Boolean templateId, String templateCode, Boolean isHtml, String templateSubject, Integer lastModify, Integer lastSend, String type, String templateContent) {
        this.templateId = templateId;
        this.templateCode = templateCode;
        this.isHtml = isHtml;
        this.templateSubject = templateSubject;
        this.lastModify = lastModify;
        this.lastSend = lastSend;
        this.type = type;
        this.templateContent = templateContent;
    }

    public MailTemplates() {
        super();
    }

    public Boolean getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Boolean templateId) {
        this.templateId = templateId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public Boolean getIsHtml() {
        return isHtml;
    }

    public void setIsHtml(Boolean isHtml) {
        this.isHtml = isHtml;
    }

    public String getTemplateSubject() {
        return templateSubject;
    }

    public void setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject == null ? null : templateSubject.trim();
    }

    public Integer getLastModify() {
        return lastModify;
    }

    public void setLastModify(Integer lastModify) {
        this.lastModify = lastModify;
    }

    public Integer getLastSend() {
        return lastSend;
    }

    public void setLastSend(Integer lastSend) {
        this.lastSend = lastSend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
    }
}