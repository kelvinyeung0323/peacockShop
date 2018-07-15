package com.peacock.shop.web.domain;

public class GoodsArticleKey {
    private Integer goodsId;

    private Integer articleId;

    private Byte adminId;

    public GoodsArticleKey(Integer goodsId, Integer articleId, Byte adminId) {
        this.goodsId = goodsId;
        this.articleId = articleId;
        this.adminId = adminId;
    }

    public GoodsArticleKey() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}