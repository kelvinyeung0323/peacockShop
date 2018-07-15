package com.peacock.shop.web.domain;

public class GoodsGallery {
    private Integer imgId;

    private Integer goodsId;

    private String imgUrl;

    private String imgDesc;

    private String thumbUrl;

    private String imgOriginal;

    public GoodsGallery(Integer imgId, Integer goodsId, String imgUrl, String imgDesc, String thumbUrl, String imgOriginal) {
        this.imgId = imgId;
        this.goodsId = goodsId;
        this.imgUrl = imgUrl;
        this.imgDesc = imgDesc;
        this.thumbUrl = thumbUrl;
        this.imgOriginal = imgOriginal;
    }

    public GoodsGallery() {
        super();
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc == null ? null : imgDesc.trim();
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl == null ? null : thumbUrl.trim();
    }

    public String getImgOriginal() {
        return imgOriginal;
    }

    public void setImgOriginal(String imgOriginal) {
        this.imgOriginal = imgOriginal == null ? null : imgOriginal.trim();
    }
}