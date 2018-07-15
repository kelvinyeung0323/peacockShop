package com.peacock.shop.web.domain;

public class CatRecommendKey {
    private Short catId;

    private Boolean recommendType;

    public CatRecommendKey(Short catId, Boolean recommendType) {
        this.catId = catId;
        this.recommendType = recommendType;
    }

    public CatRecommendKey() {
        super();
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public Boolean getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Boolean recommendType) {
        this.recommendType = recommendType;
    }
}