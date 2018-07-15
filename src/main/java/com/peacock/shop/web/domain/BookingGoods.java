package com.peacock.shop.web.domain;

public class BookingGoods {
    private Integer recId;

    private Integer userId;

    private String email;

    private String linkMan;

    private String tel;

    private Integer goodsId;

    private String goodsDesc;

    private Short goodsNumber;

    private Integer bookingTime;

    private Boolean isDispose;

    private String disposeUser;

    private Integer disposeTime;

    private String disposeNote;

    public BookingGoods(Integer recId, Integer userId, String email, String linkMan, String tel, Integer goodsId, String goodsDesc, Short goodsNumber, Integer bookingTime, Boolean isDispose, String disposeUser, Integer disposeTime, String disposeNote) {
        this.recId = recId;
        this.userId = userId;
        this.email = email;
        this.linkMan = linkMan;
        this.tel = tel;
        this.goodsId = goodsId;
        this.goodsDesc = goodsDesc;
        this.goodsNumber = goodsNumber;
        this.bookingTime = bookingTime;
        this.isDispose = isDispose;
        this.disposeUser = disposeUser;
        this.disposeTime = disposeTime;
        this.disposeNote = disposeNote;
    }

    public BookingGoods() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Integer bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Boolean getIsDispose() {
        return isDispose;
    }

    public void setIsDispose(Boolean isDispose) {
        this.isDispose = isDispose;
    }

    public String getDisposeUser() {
        return disposeUser;
    }

    public void setDisposeUser(String disposeUser) {
        this.disposeUser = disposeUser == null ? null : disposeUser.trim();
    }

    public Integer getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(Integer disposeTime) {
        this.disposeTime = disposeTime;
    }

    public String getDisposeNote() {
        return disposeNote;
    }

    public void setDisposeNote(String disposeNote) {
        this.disposeNote = disposeNote == null ? null : disposeNote.trim();
    }
}