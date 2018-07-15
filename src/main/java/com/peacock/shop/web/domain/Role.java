package com.peacock.shop.web.domain;

public class Role {
    private Short roleId;

    private String roleName;

    public Role(Short roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Role() {
        super();
    }

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}