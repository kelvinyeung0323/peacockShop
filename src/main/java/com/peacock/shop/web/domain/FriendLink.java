package com.peacock.shop.web.domain;

public class FriendLink {
    private Short linkId;

    private String linkName;

    private String linkUrl;

    private String linkLogo;

    private Byte showOrder;

    public FriendLink(Short linkId, String linkName, String linkUrl, String linkLogo, Byte showOrder) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.linkUrl = linkUrl;
        this.linkLogo = linkLogo;
        this.showOrder = showOrder;
    }

    public FriendLink() {
        super();
    }

    public Short getLinkId() {
        return linkId;
    }

    public void setLinkId(Short linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkLogo() {
        return linkLogo;
    }

    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo == null ? null : linkLogo.trim();
    }

    public Byte getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Byte showOrder) {
        this.showOrder = showOrder;
    }
}