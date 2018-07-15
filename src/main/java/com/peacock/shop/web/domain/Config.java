package com.peacock.shop.web.domain;

import java.util.Date;

public class Config {
    private Integer id;

    private String name;

    private String type;

    private String description;

    private String code;

    private Byte status;

    private Date createdAt;

    private Date updatedAt;

    private String config;

    public Config(Integer id, String name, String type, String description, String code, Byte status, Date createdAt, Date updatedAt, String config) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.code = code;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.config = config;
    }

    public Config() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}