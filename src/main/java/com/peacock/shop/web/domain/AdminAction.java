package com.peacock.shop.web.domain;

public class AdminAction {
    private Byte actionId;

    private Byte parentId;

    private String actionCode;

    private String relevance;

    public AdminAction(Byte actionId, Byte parentId, String actionCode, String relevance) {
        this.actionId = actionId;
        this.parentId = parentId;
        this.actionCode = actionCode;
        this.relevance = relevance;
    }

    public AdminAction() {
        super();
    }

    public Byte getActionId() {
        return actionId;
    }

    public void setActionId(Byte actionId) {
        this.actionId = actionId;
    }

    public Byte getParentId() {
        return parentId;
    }

    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode == null ? null : actionCode.trim();
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance == null ? null : relevance.trim();
    }
}