package com.peacock.shop.web.domain;

public class Adsense {
    private Short fromAd;

    private String referer;

    private Integer clicks;

    public Adsense(Short fromAd, String referer, Integer clicks) {
        this.fromAd = fromAd;
        this.referer = referer;
        this.clicks = clicks;
    }

    public Adsense() {
        super();
    }

    public Short getFromAd() {
        return fromAd;
    }

    public void setFromAd(Short fromAd) {
        this.fromAd = fromAd;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }
}