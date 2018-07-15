package com.peacock.shop.web.domain;

public class ShopBind {
    private Integer shopId;

    private String name;

    private String nodeId;

    private String nodeType;

    private String status;

    private String appUrl;

    public ShopBind(Integer shopId, String name, String nodeId, String nodeType, String status, String appUrl) {
        this.shopId = shopId;
        this.name = name;
        this.nodeId = nodeId;
        this.nodeType = nodeType;
        this.status = status;
        this.appUrl = appUrl;
    }

    public ShopBind() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }
}