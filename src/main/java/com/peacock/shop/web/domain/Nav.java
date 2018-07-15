package com.peacock.shop.web.domain;

public class Nav {
    private Integer id;

    private String ctype;

    private Short cid;

    private String name;

    private Boolean ifshow;

    private Boolean vieworder;

    private Boolean opennew;

    private String url;

    private String type;

    public Nav(Integer id, String ctype, Short cid, String name, Boolean ifshow, Boolean vieworder, Boolean opennew, String url, String type) {
        this.id = id;
        this.ctype = ctype;
        this.cid = cid;
        this.name = name;
        this.ifshow = ifshow;
        this.vieworder = vieworder;
        this.opennew = opennew;
        this.url = url;
        this.type = type;
    }

    public Nav() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public Short getCid() {
        return cid;
    }

    public void setCid(Short cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIfshow() {
        return ifshow;
    }

    public void setIfshow(Boolean ifshow) {
        this.ifshow = ifshow;
    }

    public Boolean getVieworder() {
        return vieworder;
    }

    public void setVieworder(Boolean vieworder) {
        this.vieworder = vieworder;
    }

    public Boolean getOpennew() {
        return opennew;
    }

    public void setOpennew(Boolean opennew) {
        this.opennew = opennew;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}