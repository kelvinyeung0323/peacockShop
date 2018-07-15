package com.peacock.shop.web.domain;

import java.util.List;

public class Category {
    private Short catId;

    private String catName;

    private String keywords;

    private String catDesc;

    private Short parentId;

    private Boolean sortOrder;

    private String templateFile;

    private String measureUnit;

    private Boolean showInNav;

    private String style;

    private Boolean isShow;

    private Byte grade;

    private String filterAttr;

    private List<Category> children;

    public Category(Short catId, String catName, String keywords, String catDesc, Short parentId, Boolean sortOrder, String templateFile, String measureUnit, Boolean showInNav, String style, Boolean isShow, Byte grade, String filterAttr) {
        this.catId = catId;
        this.catName = catName;
        this.keywords = keywords;
        this.catDesc = catDesc;
        this.parentId = parentId;
        this.sortOrder = sortOrder;
        this.templateFile = templateFile;
        this.measureUnit = measureUnit;
        this.showInNav = showInNav;
        this.style = style;
        this.isShow = isShow;
        this.grade = grade;
        this.filterAttr = filterAttr;
    }

    public Category() {
        super();
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public Boolean getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile == null ? null : templateFile.trim();
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit == null ? null : measureUnit.trim();
    }

    public Boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Boolean showInNav) {
        this.showInNav = showInNav;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }
    public Boolean isShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }

    public String getFilterAttr() {
        return filterAttr;
    }

    public void setFilterAttr(String filterAttr) {
        this.filterAttr = filterAttr == null ? null : filterAttr.trim();
    }


    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
}