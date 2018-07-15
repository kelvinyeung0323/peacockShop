package com.peacock.shop.web.domain;

public class UserBonus {
    private Integer bonusId;

    private Byte bonusTypeId;

    private Long bonusSn;

    private Integer userId;

    private Integer usedTime;

    private Integer orderId;

    private Byte emailed;

    public UserBonus(Integer bonusId, Byte bonusTypeId, Long bonusSn, Integer userId, Integer usedTime, Integer orderId, Byte emailed) {
        this.bonusId = bonusId;
        this.bonusTypeId = bonusTypeId;
        this.bonusSn = bonusSn;
        this.userId = userId;
        this.usedTime = usedTime;
        this.orderId = orderId;
        this.emailed = emailed;
    }

    public UserBonus() {
        super();
    }

    public Integer getBonusId() {
        return bonusId;
    }

    public void setBonusId(Integer bonusId) {
        this.bonusId = bonusId;
    }

    public Byte getBonusTypeId() {
        return bonusTypeId;
    }

    public void setBonusTypeId(Byte bonusTypeId) {
        this.bonusTypeId = bonusTypeId;
    }

    public Long getBonusSn() {
        return bonusSn;
    }

    public void setBonusSn(Long bonusSn) {
        this.bonusSn = bonusSn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Byte getEmailed() {
        return emailed;
    }

    public void setEmailed(Byte emailed) {
        this.emailed = emailed;
    }
}