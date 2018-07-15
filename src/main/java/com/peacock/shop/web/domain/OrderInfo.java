package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class OrderInfo {
    private Integer orderId;

    private String orderSn;

    private Integer userId;

    private Boolean orderStatus;

    private Boolean shippingStatus;

    private Boolean payStatus;

    private String consignee;

    private Short country;

    private Short province;

    private Short city;

    private Short district;

    private String address;

    private String zipcode;

    private String tel;

    private String mobile;

    private String email;

    private String bestTime;

    private String signBuilding;

    private String postscript;

    private Byte shippingId;

    private String shippingName;

    private Byte payId;

    private String payName;

    private String howOos;

    private String howSurplus;

    private String packName;

    private String cardName;

    private String cardMessage;

    private String invPayee;

    private String invContent;

    private BigDecimal goodsAmount;

    private BigDecimal shippingFee;

    private BigDecimal insureFee;

    private BigDecimal payFee;

    private BigDecimal packFee;

    private BigDecimal cardFee;

    private BigDecimal goodsDiscountFee;

    private BigDecimal moneyPaid;

    private BigDecimal surplus;

    private Integer integral;

    private BigDecimal integralMoney;

    private BigDecimal bonus;

    private BigDecimal orderAmount;

    private Short fromAd;

    private String referer;

    private Integer addTime;

    private Integer confirmTime;

    private Integer payTime;

    private Integer shippingTime;

    private Byte packId;

    private Byte cardId;

    private Integer bonusId;

    private String invoiceNo;

    private String extensionCode;

    private Integer extensionId;

    private String toBuyer;

    private String payNote;

    private Short agencyId;

    private String invType;

    private BigDecimal tax;

    private Boolean isSeparate;

    private Integer parentId;

    private BigDecimal discount;

    private String callbackStatus;

    private Integer lastmodify;

    public OrderInfo(Integer orderId, String orderSn, Integer userId, Boolean orderStatus, Boolean shippingStatus, Boolean payStatus, String consignee, Short country, Short province, Short city, Short district, String address, String zipcode, String tel, String mobile, String email, String bestTime, String signBuilding, String postscript, Byte shippingId, String shippingName, Byte payId, String payName, String howOos, String howSurplus, String packName, String cardName, String cardMessage, String invPayee, String invContent, BigDecimal goodsAmount, BigDecimal shippingFee, BigDecimal insureFee, BigDecimal payFee, BigDecimal packFee, BigDecimal cardFee, BigDecimal goodsDiscountFee, BigDecimal moneyPaid, BigDecimal surplus, Integer integral, BigDecimal integralMoney, BigDecimal bonus, BigDecimal orderAmount, Short fromAd, String referer, Integer addTime, Integer confirmTime, Integer payTime, Integer shippingTime, Byte packId, Byte cardId, Integer bonusId, String invoiceNo, String extensionCode, Integer extensionId, String toBuyer, String payNote, Short agencyId, String invType, BigDecimal tax, Boolean isSeparate, Integer parentId, BigDecimal discount, String callbackStatus, Integer lastmodify) {
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.payStatus = payStatus;
        this.consignee = consignee;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.zipcode = zipcode;
        this.tel = tel;
        this.mobile = mobile;
        this.email = email;
        this.bestTime = bestTime;
        this.signBuilding = signBuilding;
        this.postscript = postscript;
        this.shippingId = shippingId;
        this.shippingName = shippingName;
        this.payId = payId;
        this.payName = payName;
        this.howOos = howOos;
        this.howSurplus = howSurplus;
        this.packName = packName;
        this.cardName = cardName;
        this.cardMessage = cardMessage;
        this.invPayee = invPayee;
        this.invContent = invContent;
        this.goodsAmount = goodsAmount;
        this.shippingFee = shippingFee;
        this.insureFee = insureFee;
        this.payFee = payFee;
        this.packFee = packFee;
        this.cardFee = cardFee;
        this.goodsDiscountFee = goodsDiscountFee;
        this.moneyPaid = moneyPaid;
        this.surplus = surplus;
        this.integral = integral;
        this.integralMoney = integralMoney;
        this.bonus = bonus;
        this.orderAmount = orderAmount;
        this.fromAd = fromAd;
        this.referer = referer;
        this.addTime = addTime;
        this.confirmTime = confirmTime;
        this.payTime = payTime;
        this.shippingTime = shippingTime;
        this.packId = packId;
        this.cardId = cardId;
        this.bonusId = bonusId;
        this.invoiceNo = invoiceNo;
        this.extensionCode = extensionCode;
        this.extensionId = extensionId;
        this.toBuyer = toBuyer;
        this.payNote = payNote;
        this.agencyId = agencyId;
        this.invType = invType;
        this.tax = tax;
        this.isSeparate = isSeparate;
        this.parentId = parentId;
        this.discount = discount;
        this.callbackStatus = callbackStatus;
        this.lastmodify = lastmodify;
    }

    public OrderInfo() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public Short getCountry() {
        return country;
    }

    public void setCountry(Short country) {
        this.country = country;
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrict() {
        return district;
    }

    public void setDistrict(Short district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime == null ? null : bestTime.trim();
    }

    public String getSignBuilding() {
        return signBuilding;
    }

    public void setSignBuilding(String signBuilding) {
        this.signBuilding = signBuilding == null ? null : signBuilding.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public Byte getPayId() {
        return payId;
    }

    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getHowOos() {
        return howOos;
    }

    public void setHowOos(String howOos) {
        this.howOos = howOos == null ? null : howOos.trim();
    }

    public String getHowSurplus() {
        return howSurplus;
    }

    public void setHowSurplus(String howSurplus) {
        this.howSurplus = howSurplus == null ? null : howSurplus.trim();
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName == null ? null : packName.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardMessage() {
        return cardMessage;
    }

    public void setCardMessage(String cardMessage) {
        this.cardMessage = cardMessage == null ? null : cardMessage.trim();
    }

    public String getInvPayee() {
        return invPayee;
    }

    public void setInvPayee(String invPayee) {
        this.invPayee = invPayee == null ? null : invPayee.trim();
    }

    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent == null ? null : invContent.trim();
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getInsureFee() {
        return insureFee;
    }

    public void setInsureFee(BigDecimal insureFee) {
        this.insureFee = insureFee;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    public BigDecimal getCardFee() {
        return cardFee;
    }

    public void setCardFee(BigDecimal cardFee) {
        this.cardFee = cardFee;
    }

    public BigDecimal getGoodsDiscountFee() {
        return goodsDiscountFee;
    }

    public void setGoodsDiscountFee(BigDecimal goodsDiscountFee) {
        this.goodsDiscountFee = goodsDiscountFee;
    }

    public BigDecimal getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(BigDecimal moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public BigDecimal getSurplus() {
        return surplus;
    }

    public void setSurplus(BigDecimal surplus) {
        this.surplus = surplus;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getIntegralMoney() {
        return integralMoney;
    }

    public void setIntegralMoney(BigDecimal integralMoney) {
        this.integralMoney = integralMoney;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Short getFromAd() {
        return fromAd;
    }

    public void setFromAd(Short fromAd) {
        this.fromAd = fromAd;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Integer shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Byte getPackId() {
        return packId;
    }

    public void setPackId(Byte packId) {
        this.packId = packId;
    }

    public Byte getCardId() {
        return cardId;
    }

    public void setCardId(Byte cardId) {
        this.cardId = cardId;
    }

    public Integer getBonusId() {
        return bonusId;
    }

    public void setBonusId(Integer bonusId) {
        this.bonusId = bonusId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode == null ? null : extensionCode.trim();
    }

    public Integer getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(Integer extensionId) {
        this.extensionId = extensionId;
    }

    public String getToBuyer() {
        return toBuyer;
    }

    public void setToBuyer(String toBuyer) {
        this.toBuyer = toBuyer == null ? null : toBuyer.trim();
    }

    public String getPayNote() {
        return payNote;
    }

    public void setPayNote(String payNote) {
        this.payNote = payNote == null ? null : payNote.trim();
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType == null ? null : invType.trim();
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Boolean getIsSeparate() {
        return isSeparate;
    }

    public void setIsSeparate(Boolean isSeparate) {
        this.isSeparate = isSeparate;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getCallbackStatus() {
        return callbackStatus;
    }

    public void setCallbackStatus(String callbackStatus) {
        this.callbackStatus = callbackStatus == null ? null : callbackStatus.trim();
    }

    public Integer getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Integer lastmodify) {
        this.lastmodify = lastmodify;
    }
}