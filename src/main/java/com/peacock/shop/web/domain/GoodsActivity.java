package com.peacock.shop.web.domain;

public class GoodsActivity {
    private Integer actId;

    private String actName;

    private Byte actType;

    private Integer goodsId;

    private Integer productId;

    private String goodsName;

    private Integer startTime;

    private Integer endTime;

    private Byte isFinished;

    public GoodsActivity(Integer actId, String actName, Byte actType, Integer goodsId, Integer productId, String goodsName, Integer startTime, Integer endTime, Byte isFinished) {
        this.actId = actId;
        this.actName = actName;
        this.actType = actType;
        this.goodsId = goodsId;
        this.productId = productId;
        this.goodsName = goodsName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isFinished = isFinished;
    }

    public GoodsActivity() {
        super();
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Byte getActType() {
        return actType;
    }

    public void setActType(Byte actType) {
        this.actType = actType;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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

    public Byte getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Byte isFinished) {
        this.isFinished = isFinished;
    }
}