package com.peacock.shop.web.domain;

public class AdCustom {
    private Integer adId;

    private Boolean adType;

    private String adName;

    private Integer addTime;

    private String url;

    private Byte adStatus;

    private String content;

    public AdCustom(Integer adId, Boolean adType, String adName, Integer addTime, String url, Byte adStatus, String content) {
        this.adId = adId;
        this.adType = adType;
        this.adName = adName;
        this.addTime = addTime;
        this.url = url;
        this.adStatus = adStatus;
        this.content = content;
    }

    public AdCustom() {
        super();
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Boolean getAdType() {
        return adType;
    }

    public void setAdType(Boolean adType) {
        this.adType = adType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Byte adStatus) {
        this.adStatus = adStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}