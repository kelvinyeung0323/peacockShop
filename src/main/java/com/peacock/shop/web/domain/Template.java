package com.peacock.shop.web.domain;

public class Template {
    private String filename;

    private String region;

    private String library;

    private Boolean sortOrder;

    private Short id;

    private Boolean number;

    private Boolean type;

    private String theme;

    private String remarks;

    public Template(String filename, String region, String library, Boolean sortOrder, Short id, Boolean number, Boolean type, String theme, String remarks) {
        this.filename = filename;
        this.region = region;
        this.library = library;
        this.sortOrder = sortOrder;
        this.id = id;
        this.number = number;
        this.type = type;
        this.theme = theme;
        this.remarks = remarks;
    }

    public Template() {
        super();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library == null ? null : library.trim();
    }

    public Boolean getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Boolean getNumber() {
        return number;
    }

    public void setNumber(Boolean number) {
        this.number = number;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}