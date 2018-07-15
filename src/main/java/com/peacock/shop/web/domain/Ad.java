package com.peacock.shop.web.domain;

public class Ad {
    private Short adId;

    private Short positionId;

    private Byte mediaType;

    private String adName;

    private String adLink;

    private Integer startTime;

    private Integer endTime;

    private String linkMan;

    private String linkEmail;

    private String linkPhone;

    private Integer clickCount;

    private Byte enabled;

    private String adCode;

    //extend
    private String positionName;

    private Short  adWidth;

    private Short  adHeight;

    private String positionDesc;

    private String positionStyle;

    public Ad(Short adId, Short positionId, Byte mediaType, String adName, String adLink, Integer startTime, Integer endTime, String linkMan, String linkEmail, String linkPhone, Integer clickCount, Byte enabled, String adCode) {
        this.adId = adId;
        this.positionId = positionId;
        this.mediaType = mediaType;
        this.adName = adName;
        this.adLink = adLink;
        this.startTime = startTime;
        this.endTime = endTime;
        this.linkMan = linkMan;
        this.linkEmail = linkEmail;
        this.linkPhone = linkPhone;
        this.clickCount = clickCount;
        this.enabled = enabled;
        this.adCode = adCode;
    }

    public Ad() {
        super();
    }

    public Short getAdId() {
        return adId;
    }

    public void setAdId(Short adId) {
        this.adId = adId;
    }

    public Short getPositionId() {
        return positionId;
    }

    public void setPositionId(Short positionId) {
        this.positionId = positionId;
    }

    public Byte getMediaType() {
        return mediaType;
    }

    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
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

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }


    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Short getAdWidth() {
        return adWidth;
    }

    public void setAdWidth(Short adWidth) {
        this.adWidth = adWidth;
    }

    public Short getAdHeight() {
        return adHeight;
    }

    public void setAdHeight(Short adHeight) {
        this.adHeight = adHeight;
    }

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    public String getPositionStyle() {
        return positionStyle;
    }

    public void setPositionStyle(String positionStyle) {
        this.positionStyle = positionStyle;
    }
}