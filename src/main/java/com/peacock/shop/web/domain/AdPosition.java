package com.peacock.shop.web.domain;

public class AdPosition {
    private Byte positionId;

    private String positionName;

    private Short adWidth;

    private Short adHeight;

    private String positionDesc;

    private String positionStyle;

    public AdPosition(Byte positionId, String positionName, Short adWidth, Short adHeight, String positionDesc, String positionStyle) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.adWidth = adWidth;
        this.adHeight = adHeight;
        this.positionDesc = positionDesc;
        this.positionStyle = positionStyle;
    }

    public AdPosition() {
        super();
    }

    public Byte getPositionId() {
        return positionId;
    }

    public void setPositionId(Byte positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
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
        this.positionDesc = positionDesc == null ? null : positionDesc.trim();
    }

    public String getPositionStyle() {
        return positionStyle;
    }

    public void setPositionStyle(String positionStyle) {
        this.positionStyle = positionStyle == null ? null : positionStyle.trim();
    }
}