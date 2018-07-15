package com.peacock.shop.web.domain;

public class GoodsActivityWithBLOBs extends GoodsActivity {
    private String actDesc;

    private String extInfo;

    public GoodsActivityWithBLOBs(Integer actId, String actName, Byte actType, Integer goodsId, Integer productId, String goodsName, Integer startTime, Integer endTime, Byte isFinished, String actDesc, String extInfo) {
        super(actId, actName, actType, goodsId, productId, goodsName, startTime, endTime, isFinished);
        this.actDesc = actDesc;
        this.extInfo = extInfo;
    }

    public GoodsActivityWithBLOBs() {
        super();
    }

    public String getActDesc() {
        return actDesc;
    }

    public void setActDesc(String actDesc) {
        this.actDesc = actDesc == null ? null : actDesc.trim();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }
}