package com.peacock.shop.web.domain;

public class Topic {
    private Integer topicId;

    private String title;

    private Integer startTime;

    private Integer endTime;

    private String template;

    private String topicImg;

    private String titlePic;

    private String baseStyle;

    private String keywords;

    private String description;

    public Topic(Integer topicId, String title, Integer startTime, Integer endTime, String template, String topicImg, String titlePic, String baseStyle, String keywords, String description) {
        this.topicId = topicId;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.template = template;
        this.topicImg = topicImg;
        this.titlePic = titlePic;
        this.baseStyle = baseStyle;
        this.keywords = keywords;
        this.description = description;
    }

    public Topic() {
        super();
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public String getTopicImg() {
        return topicImg;
    }

    public void setTopicImg(String topicImg) {
        this.topicImg = topicImg == null ? null : topicImg.trim();
    }

    public String getTitlePic() {
        return titlePic;
    }

    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic == null ? null : titlePic.trim();
    }

    public String getBaseStyle() {
        return baseStyle;
    }

    public void setBaseStyle(String baseStyle) {
        this.baseStyle = baseStyle == null ? null : baseStyle.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}