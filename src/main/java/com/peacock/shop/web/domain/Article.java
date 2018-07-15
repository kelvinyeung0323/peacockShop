package com.peacock.shop.web.domain;

public class Article {
    private Integer articleId;

    private Short catId;

    private String title;

    private String author;

    private String authorEmail;

    private String keywords;

    private Boolean articleType;

    private Boolean isOpen;

    private Integer addTime;

    private String fileUrl;

    private Boolean openType;

    private String link;

    private String description;

    private String content;

    public Article(Integer articleId, Short catId, String title, String author, String authorEmail, String keywords, Boolean articleType, Boolean isOpen, Integer addTime, String fileUrl, Boolean openType, String link, String description, String content) {
        this.articleId = articleId;
        this.catId = catId;
        this.title = title;
        this.author = author;
        this.authorEmail = authorEmail;
        this.keywords = keywords;
        this.articleType = articleType;
        this.isOpen = isOpen;
        this.addTime = addTime;
        this.fileUrl = fileUrl;
        this.openType = openType;
        this.link = link;
        this.description = description;
        this.content = content;
    }

    public Article() {
        super();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail == null ? null : authorEmail.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Boolean getArticleType() {
        return articleType;
    }

    public void setArticleType(Boolean articleType) {
        this.articleType = articleType;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Boolean getOpenType() {
        return openType;
    }

    public void setOpenType(Boolean openType) {
        this.openType = openType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}