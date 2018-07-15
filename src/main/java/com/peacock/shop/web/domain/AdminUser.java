package com.peacock.shop.web.domain;

public class AdminUser {
    private Short userId;

    private String userName;

    private String email;

    private String password;

    private String ecSalt;

    private Integer addTime;

    private Integer lastLogin;

    private String lastIp;

    private String langType;

    private Short agencyId;

    private Short suppliersId;

    private Short roleId;

    private String passportUid;

    private Short yqCreateTime;

    public AdminUser(Short userId, String userName, String email, String password, String ecSalt, Integer addTime, Integer lastLogin, String lastIp, String langType, Short agencyId, Short suppliersId, Short roleId, String passportUid, Short yqCreateTime) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.ecSalt = ecSalt;
        this.addTime = addTime;
        this.lastLogin = lastLogin;
        this.lastIp = lastIp;
        this.langType = langType;
        this.agencyId = agencyId;
        this.suppliersId = suppliersId;
        this.roleId = roleId;
        this.passportUid = passportUid;
        this.yqCreateTime = yqCreateTime;
    }

    public AdminUser() {
        super();
    }

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEcSalt() {
        return ecSalt;
    }

    public void setEcSalt(String ecSalt) {
        this.ecSalt = ecSalt == null ? null : ecSalt.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType == null ? null : langType.trim();
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getPassportUid() {
        return passportUid;
    }

    public void setPassportUid(String passportUid) {
        this.passportUid = passportUid == null ? null : passportUid.trim();
    }

    public Short getYqCreateTime() {
        return yqCreateTime;
    }

    public void setYqCreateTime(Short yqCreateTime) {
        this.yqCreateTime = yqCreateTime;
    }
}