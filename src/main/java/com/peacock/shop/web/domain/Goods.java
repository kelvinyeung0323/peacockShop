package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class Goods {
    private Integer goodsId;

    private Short catId;

    private String goodsSn;

    private String goodsName;

    private String goodsNameStyle;

    private Integer clickCount;

    private Short brandId;

    private String providerName;

    private Integer goodsNumber;

    private BigDecimal goodsWeight;

    private BigDecimal marketPrice;

    private Short virtualSales;

    private BigDecimal shopPrice;

    private BigDecimal promotePrice;

    private Integer promoteStartDate;

    private Integer promoteEndDate;

    private Byte warnNumber;

    private String keywords;

    private String goodsBrief;

    private String goodsThumb;

    private String goodsImg;

    private String originalImg;

    private Byte isReal;

    private String extensionCode;

    private Boolean isOnSale;

    private Boolean isAloneSale;

    private Boolean isShipping;

    private Integer integral;

    private Integer addTime;

    private Short sortOrder;

    private Boolean isDelete;

    private Boolean isBest;

    private Boolean isNew;

    private Boolean isHot;

    private Boolean isPromote;

    private Byte bonusTypeId;

    private Integer lastUpdate;

    private Short goodsType;

    private String sellerNote;

    private Integer giveIntegral;

    private Integer rankIntegral;

    private Short suppliersId;

    private Boolean isCheck;

    private String goodsDesc;

    public Goods(Integer goodsId, Short catId, String goodsSn, String goodsName, String goodsNameStyle, Integer clickCount, Short brandId, String providerName, Integer goodsNumber, BigDecimal goodsWeight, BigDecimal marketPrice, Short virtualSales, BigDecimal shopPrice, BigDecimal promotePrice, Integer promoteStartDate, Integer promoteEndDate, Byte warnNumber, String keywords, String goodsBrief, String goodsThumb, String goodsImg, String originalImg, Byte isReal, String extensionCode, Boolean isOnSale, Boolean isAloneSale, Boolean isShipping, Integer integral, Integer addTime, Short sortOrder, Boolean isDelete, Boolean isBest, Boolean isNew, Boolean isHot, Boolean isPromote, Byte bonusTypeId, Integer lastUpdate, Short goodsType, String sellerNote, Integer giveIntegral, Integer rankIntegral, Short suppliersId, Boolean isCheck, String goodsDesc) {
        this.goodsId = goodsId;
        this.catId = catId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.goodsNameStyle = goodsNameStyle;
        this.clickCount = clickCount;
        this.brandId = brandId;
        this.providerName = providerName;
        this.goodsNumber = goodsNumber;
        this.goodsWeight = goodsWeight;
        this.marketPrice = marketPrice;
        this.virtualSales = virtualSales;
        this.shopPrice = shopPrice;
        this.promotePrice = promotePrice;
        this.promoteStartDate = promoteStartDate;
        this.promoteEndDate = promoteEndDate;
        this.warnNumber = warnNumber;
        this.keywords = keywords;
        this.goodsBrief = goodsBrief;
        this.goodsThumb = goodsThumb;
        this.goodsImg = goodsImg;
        this.originalImg = originalImg;
        this.isReal = isReal;
        this.extensionCode = extensionCode;
        this.isOnSale = isOnSale;
        this.isAloneSale = isAloneSale;
        this.isShipping = isShipping;
        this.integral = integral;
        this.addTime = addTime;
        this.sortOrder = sortOrder;
        this.isDelete = isDelete;
        this.isBest = isBest;
        this.isNew = isNew;
        this.isHot = isHot;
        this.isPromote = isPromote;
        this.bonusTypeId = bonusTypeId;
        this.lastUpdate = lastUpdate;
        this.goodsType = goodsType;
        this.sellerNote = sellerNote;
        this.giveIntegral = giveIntegral;
        this.rankIntegral = rankIntegral;
        this.suppliersId = suppliersId;
        this.isCheck = isCheck;
        this.goodsDesc = goodsDesc;
    }

    public Goods(Integer goodsId, Short catId, String goodsSn, String goodsName, String goodsNameStyle, Integer clickCount, Short brandId, String providerName, Integer goodsNumber, BigDecimal goodsWeight, BigDecimal marketPrice, Short virtualSales, BigDecimal shopPrice, BigDecimal promotePrice, Integer promoteStartDate, Integer promoteEndDate, Byte warnNumber, String keywords, String goodsBrief, String goodsThumb, String goodsImg, String originalImg, Byte isReal, String extensionCode, Boolean isOnSale, Boolean isAloneSale, Boolean isShipping, Integer integral, Integer addTime, Short sortOrder, Boolean isDelete, Boolean isBest, Boolean isNew, Boolean isHot, Boolean isPromote, Byte bonusTypeId, Integer lastUpdate, Short goodsType, String sellerNote, Integer giveIntegral, Integer rankIntegral, Short suppliersId, Boolean isCheck) {
        this.goodsId = goodsId;
        this.catId = catId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.goodsNameStyle = goodsNameStyle;
        this.clickCount = clickCount;
        this.brandId = brandId;
        this.providerName = providerName;
        this.goodsNumber = goodsNumber;
        this.goodsWeight = goodsWeight;
        this.marketPrice = marketPrice;
        this.virtualSales = virtualSales;
        this.shopPrice = shopPrice;
        this.promotePrice = promotePrice;
        this.promoteStartDate = promoteStartDate;
        this.promoteEndDate = promoteEndDate;
        this.warnNumber = warnNumber;
        this.keywords = keywords;
        this.goodsBrief = goodsBrief;
        this.goodsThumb = goodsThumb;
        this.goodsImg = goodsImg;
        this.originalImg = originalImg;
        this.isReal = isReal;
        this.extensionCode = extensionCode;
        this.isOnSale = isOnSale;
        this.isAloneSale = isAloneSale;
        this.isShipping = isShipping;
        this.integral = integral;
        this.addTime = addTime;
        this.sortOrder = sortOrder;
        this.isDelete = isDelete;
        this.isBest = isBest;
        this.isNew = isNew;
        this.isHot = isHot;
        this.isPromote = isPromote;
        this.bonusTypeId = bonusTypeId;
        this.lastUpdate = lastUpdate;
        this.goodsType = goodsType;
        this.sellerNote = sellerNote;
        this.giveIntegral = giveIntegral;
        this.rankIntegral = rankIntegral;
        this.suppliersId = suppliersId;
        this.isCheck = isCheck;

    }
    public Goods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsNameStyle() {
        return goodsNameStyle;
    }

    public void setGoodsNameStyle(String goodsNameStyle) {
        this.goodsNameStyle = goodsNameStyle == null ? null : goodsNameStyle.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Short getVirtualSales() {
        return virtualSales;
    }

    public void setVirtualSales(Short virtualSales) {
        this.virtualSales = virtualSales;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getPromoteStartDate() {
        return promoteStartDate;
    }

    public void setPromoteStartDate(Integer promoteStartDate) {
        this.promoteStartDate = promoteStartDate;
    }

    public Integer getPromoteEndDate() {
        return promoteEndDate;
    }

    public void setPromoteEndDate(Integer promoteEndDate) {
        this.promoteEndDate = promoteEndDate;
    }

    public Byte getWarnNumber() {
        return warnNumber;
    }

    public void setWarnNumber(Byte warnNumber) {
        this.warnNumber = warnNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public String getGoodsThumb() {
        return goodsThumb;
    }

    public void setGoodsThumb(String goodsThumb) {
        this.goodsThumb = goodsThumb == null ? null : goodsThumb.trim();
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public String getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(String originalImg) {
        this.originalImg = originalImg == null ? null : originalImg.trim();
    }

    public Byte getIsReal() {
        return isReal;
    }

    public void setIsReal(Byte isReal) {
        this.isReal = isReal;
    }

    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode == null ? null : extensionCode.trim();
    }

    public Boolean getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Boolean getIsAloneSale() {
        return isAloneSale;
    }

    public void setIsAloneSale(Boolean isAloneSale) {
        this.isAloneSale = isAloneSale;
    }

    public Boolean getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Boolean isShipping) {
        this.isShipping = isShipping;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public void setIsBest(Boolean isBest) {
        this.isBest = isBest;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Boolean isPromote) {
        this.isPromote = isPromote;
    }

    public Byte getBonusTypeId() {
        return bonusTypeId;
    }

    public void setBonusTypeId(Byte bonusTypeId) {
        this.bonusTypeId = bonusTypeId;
    }

    public Integer getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    public String getSellerNote() {
        return sellerNote;
    }

    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote == null ? null : sellerNote.trim();
    }

    public Integer getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(Integer giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public Integer getRankIntegral() {
        return rankIntegral;
    }

    public void setRankIntegral(Integer rankIntegral) {
        this.rankIntegral = rankIntegral;
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }
}