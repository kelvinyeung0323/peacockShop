package com.peacock.shop.web.domain;

public class TopicWithBLOBs extends Topic {
    private String intro;

    private String data;

    private String css;

    private String htmls;

    public TopicWithBLOBs(Integer topicId, String title, Integer startTime, Integer endTime, String template, String topicImg, String titlePic, String baseStyle, String keywords, String description, String intro, String data, String css, String htmls) {
        super(topicId, title, startTime, endTime, template, topicImg, titlePic, baseStyle, keywords, description);
        this.intro = intro;
        this.data = data;
        this.css = css;
        this.htmls = htmls;
    }

    public TopicWithBLOBs() {
        super();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css == null ? null : css.trim();
    }

    public String getHtmls() {
        return htmls;
    }

    public void setHtmls(String htmls) {
        this.htmls = htmls == null ? null : htmls.trim();
    }
}