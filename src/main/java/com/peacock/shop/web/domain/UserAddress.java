package com.peacock.shop.web.domain;

public class UserAddress {
    private Integer addressId;

    private String addressName;

    private Integer userId;

    private String consignee;

    private String email;

    private Short country;

    private Short province;

    private Short city;

    private Short district;

    private String address;

    private String zipcode;

    private String tel;

    private String mobile;

    private String signBuilding;

    private String bestTime;

    public UserAddress(Integer addressId, String addressName, Integer userId, String consignee, String email, Short country, Short province, Short city, Short district, String address, String zipcode, String tel, String mobile, String signBuilding, String bestTime) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.userId = userId;
        this.consignee = consignee;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.zipcode = zipcode;
        this.tel = tel;
        this.mobile = mobile;
        this.signBuilding = signBuilding;
        this.bestTime = bestTime;
    }

    public UserAddress() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getSignBuilding() {
        return signBuilding;
    }

    public void setSignBuilding(String signBuilding) {
        this.signBuilding = signBuilding == null ? null : signBuilding.trim();
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime == null ? null : bestTime.trim();
    }
}