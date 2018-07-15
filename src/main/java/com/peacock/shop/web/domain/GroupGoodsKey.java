package com.peacock.shop.web.domain;

public class GroupGoodsKey {
    private Integer parentId;

    private Integer goodsId;

    private Byte adminId;

    public GroupGoodsKey(Integer parentId, Integer goodsId, Byte adminId) {
        this.parentId = parentId;
        this.goodsId = goodsId;
        this.adminId = adminId;
    }

    public GroupGoodsKey() {
        super();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}