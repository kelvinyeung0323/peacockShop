package com.peacock.shop.web.domain;

public class AutoManage extends AutoManageKey {
    private Integer starttime;

    private Integer endtime;

    public AutoManage(Integer itemId, String type, Integer starttime, Integer endtime) {
        super(itemId, type);
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public AutoManage() {
        super();
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }
}