package com.peacock.shop.web.domain;

public class OrderAction {
    private Integer actionId;

    private Integer orderId;

    private String actionUser;

    private Boolean orderStatus;

    private Boolean shippingStatus;

    private Boolean payStatus;

    private Boolean actionPlace;

    private String actionNote;

    private Integer logTime;

    public OrderAction(Integer actionId, Integer orderId, String actionUser, Boolean orderStatus, Boolean shippingStatus, Boolean payStatus, Boolean actionPlace, String actionNote, Integer logTime) {
        this.actionId = actionId;
        this.orderId = orderId;
        this.actionUser = actionUser;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.payStatus = payStatus;
        this.actionPlace = actionPlace;
        this.actionNote = actionNote;
        this.logTime = logTime;
    }

    public OrderAction() {
        super();
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getActionUser() {
        return actionUser;
    }

    public void setActionUser(String actionUser) {
        this.actionUser = actionUser == null ? null : actionUser.trim();
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public Boolean getActionPlace() {
        return actionPlace;
    }

    public void setActionPlace(Boolean actionPlace) {
        this.actionPlace = actionPlace;
    }

    public String getActionNote() {
        return actionNote;
    }

    public void setActionNote(String actionNote) {
        this.actionNote = actionNote == null ? null : actionNote.trim();
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }
}