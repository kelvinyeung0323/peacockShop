package com.peacock.shop.web.domain;

public class RegField {
    private Byte id;

    private String regFieldName;

    private Byte disOrder;

    private Boolean display;

    private Boolean type;

    private Boolean isNeed;

    public RegField(Byte id, String regFieldName, Byte disOrder, Boolean display, Boolean type, Boolean isNeed) {
        this.id = id;
        this.regFieldName = regFieldName;
        this.disOrder = disOrder;
        this.display = display;
        this.type = type;
        this.isNeed = isNeed;
    }

    public RegField() {
        super();
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getRegFieldName() {
        return regFieldName;
    }

    public void setRegFieldName(String regFieldName) {
        this.regFieldName = regFieldName == null ? null : regFieldName.trim();
    }

    public Byte getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(Byte disOrder) {
        this.disOrder = disOrder;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getIsNeed() {
        return isNeed;
    }

    public void setIsNeed(Boolean isNeed) {
        this.isNeed = isNeed;
    }
}