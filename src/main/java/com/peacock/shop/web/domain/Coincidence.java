package com.peacock.shop.web.domain;

public class Coincidence extends CoincidenceKey {
    private Integer time;

    public Coincidence(String typeId, String type, Integer time) {
        super(typeId, type);
        this.time = time;
    }

    public Coincidence() {
        super();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}