package com.peacock.shop.web.domain;

public class Agency {
    private Short agencyId;

    private String agencyName;

    private String agencyDesc;

    public Agency(Short agencyId, String agencyName, String agencyDesc) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.agencyDesc = agencyDesc;
    }

    public Agency() {
        super();
    }

    public Short getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    public String getAgencyDesc() {
        return agencyDesc;
    }

    public void setAgencyDesc(String agencyDesc) {
        this.agencyDesc = agencyDesc == null ? null : agencyDesc.trim();
    }
}