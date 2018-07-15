package com.peacock.shop.web.domain;

public class stats {
    private Integer accessTime;

    private String ipAddress;

    private Short visitTimes;

    private String browser;

    private String system;

    private String language;

    private String area;

    private String refererDomain;

    private String refererPath;

    private String accessUrl;

    public stats(Integer accessTime, String ipAddress, Short visitTimes, String browser, String system, String language, String area, String refererDomain, String refererPath, String accessUrl) {
        this.accessTime = accessTime;
        this.ipAddress = ipAddress;
        this.visitTimes = visitTimes;
        this.browser = browser;
        this.system = system;
        this.language = language;
        this.area = area;
        this.refererDomain = refererDomain;
        this.refererPath = refererPath;
        this.accessUrl = accessUrl;
    }

    public stats() {
        super();
    }

    public Integer getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Integer accessTime) {
        this.accessTime = accessTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Short getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(Short visitTimes) {
        this.visitTimes = visitTimes;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRefererDomain() {
        return refererDomain;
    }

    public void setRefererDomain(String refererDomain) {
        this.refererDomain = refererDomain == null ? null : refererDomain.trim();
    }

    public String getRefererPath() {
        return refererPath;
    }

    public void setRefererPath(String refererPath) {
        this.refererPath = refererPath == null ? null : refererPath.trim();
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl == null ? null : accessUrl.trim();
    }
}