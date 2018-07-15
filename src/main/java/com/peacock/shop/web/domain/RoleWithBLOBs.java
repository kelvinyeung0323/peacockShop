package com.peacock.shop.web.domain;

public class RoleWithBLOBs extends Role {
    private String actionList;

    private String roleDescribe;

    public RoleWithBLOBs(Short roleId, String roleName, String actionList, String roleDescribe) {
        super(roleId, roleName);
        this.actionList = actionList;
        this.roleDescribe = roleDescribe;
    }

    public RoleWithBLOBs() {
        super();
    }

    public String getActionList() {
        return actionList;
    }

    public void setActionList(String actionList) {
        this.actionList = actionList == null ? null : actionList.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }
}