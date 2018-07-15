package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class DeliveryOrder {
    private Integer deliveryId;

    private String deliverySn;

    private String orderSn;

    private Integer orderId;

    private String invoiceNo;

    private Integer addTime;

    private Byte shippingId;

    private String shippingName;

    private Integer userId;

    private String actionUser;

    private String consignee;

    private String address;

    private Short country;

    private Short province;

    private Short city;

    private Short district;

    private String signBuilding;

    private String email;

    private String zipcode;

    private String tel;

    private String mobile;

    private String bestTime;

    private String postscript;

    private String howOos;

    private BigDecimal insureFee;

    private BigDecimal shippingFee;

    private Integer updateTime;

    private Short suppliersId;

    private Boolean status;

    private Short agencyId;

    public DeliveryOrder(Integer deliveryId, String deliverySn, String orderSn, Integer orderId, String invoiceNo, Integer addTime, Byte shippingId, String shippingName, Integer userId, String actionUser, String consignee, String address, Short country, Short province, Short city, Short district, String signBuilding, String email, String zipcode, String tel, String mobile, String bestTime, String postscript, String howOos, BigDecimal insureFee, BigDecimal shippingFee, Integer updateTime, Short suppliersId, Boolean status, Short agencyId) {
        this.deliveryId = deliveryId;
        this.deliverySn = deliverySn;
        this.orderSn = orderSn;
        this.orderId = orderId;
        this.invoiceNo = invoiceNo;
        this.addTime = addTime;
        this.shippingId = shippingId;
        this.shippingName = shippingName;
        this.userId = userId;
        this.actionUser = actionUser;
        this.consignee = consignee;
        this.address = address;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.signBuilding = signBuilding;
        this.email = email;
        this.zipcode = zipcode;
        this.tel = tel;
        this.mobile = mobile;
        this.bestTime = bestTime;
        this.postscript = postscript;
        this.howOos = howOos;
        this.insureFee = insureFee;
        this.shippingFee = shippingFee;
        this.updateTime = updateTime;
        this.suppliersId = suppliersId;
        this.status = status;
        this.agencyId = agencyId;
    }

    public DeliveryOrder() {
        super();
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getActionUser() {
        return actionUser;
    }

    public void setActionUser(String actionUser) {
        this.actionUser = actionUser == null ? null : actionUser.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getCountry() {
        return country;
    }

    public void setCountry(Short country) {
        this.country = country;
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrict() {
        return district;
    }

    public void setDistrict(Short district) {
        this.district = district;
    }

    public String getSignBuilding() {
        return signBuilding;
    }

    public void setSignBuilding(String signBuilding) {
        this.signBuilding = signBuilding == null ? null : signBuilding.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime == null ? null : bestTime.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public String getHowOos() {
        return howOos;
    }

    public void setHowOos(String howOos) {
        this.howOos = howOos == null ? null : howOos.trim();
    }

    public BigDecimal getInsureFee() {
        return insureFee;
    }

    public void setInsureFee(BigDecimal insureFee) {
        this.insureFee = insureFee;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }
}