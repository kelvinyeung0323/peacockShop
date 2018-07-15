package com.peacock.shop.web.domain;

public class Plugins {
    private String code;

    private String version;

    private String library;

    private Boolean assign;

    private Integer installDate;

    public Plugins(String code, String version, String library, Boolean assign, Integer installDate) {
        this.code = code;
        this.version = version;
        this.library = library;
        this.assign = assign;
        this.installDate = installDate;
    }

    public Plugins() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library == null ? null : library.trim();
    }

    public Boolean getAssign() {
        return assign;
    }

    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    public Integer getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Integer installDate) {
        this.installDate = installDate;
    }
}