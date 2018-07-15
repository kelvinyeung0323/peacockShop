package com.peacock.shop.web.domain;

public class LinkGoodsKey {
    private Integer goodsId;

    private Integer linkGoodsId;

    private Byte adminId;

    public LinkGoodsKey(Integer goodsId, Integer linkGoodsId, Byte adminId) {
        this.goodsId = goodsId;
        this.linkGoodsId = linkGoodsId;
        this.adminId = adminId;
    }

    public LinkGoodsKey() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getLinkGoodsId() {
        return linkGoodsId;
    }

    public void setLinkGoodsId(Integer linkGoodsId) {
        this.linkGoodsId = linkGoodsId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}