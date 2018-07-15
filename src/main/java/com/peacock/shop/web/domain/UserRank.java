package com.peacock.shop.web.domain;

public class UserRank {
    private Byte rankId;

    private String rankName;

    private Integer minPoints;

    private Integer maxPoints;

    private Byte discount;

    private Boolean showPrice;

    private Boolean specialRank;

    public UserRank(Byte rankId, String rankName, Integer minPoints, Integer maxPoints, Byte discount, Boolean showPrice, Boolean specialRank) {
        this.rankId = rankId;
        this.rankName = rankName;
        this.minPoints = minPoints;
        this.maxPoints = maxPoints;
        this.discount = discount;
        this.showPrice = showPrice;
        this.specialRank = specialRank;
    }

    public UserRank() {
        super();
    }

    public Byte getRankId() {
        return rankId;
    }

    public void setRankId(Byte rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public Integer getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(Integer minPoints) {
        this.minPoints = minPoints;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Byte getDiscount() {
        return discount;
    }

    public void setDiscount(Byte discount) {
        this.discount = discount;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public Boolean getSpecialRank() {
        return specialRank;
    }

    public void setSpecialRank(Boolean specialRank) {
        this.specialRank = specialRank;
    }
}