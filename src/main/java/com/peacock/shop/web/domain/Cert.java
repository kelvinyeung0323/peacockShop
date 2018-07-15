package com.peacock.shop.web.domain;

public class Cert {
    private Integer id;

    private Byte configId;

    private byte[] file;

    public Cert(Integer id, Byte configId, byte[] file) {
        this.id = id;
        this.configId = configId;
        this.file = file;
    }

    public Cert() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getConfigId() {
        return configId;
    }

    public void setConfigId(Byte configId) {
        this.configId = configId;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}