package com.peacock.shop.web.domain;

public class AdminUserWithBLOBs extends AdminUser {
    private String actionList;

    private String navList;

    private String todolist;

    public AdminUserWithBLOBs(Short userId, String userName, String email, String password, String ecSalt, Integer addTime, Integer lastLogin, String lastIp, String langType, Short agencyId, Short suppliersId, Short roleId, String passportUid, Short yqCreateTime, String actionList, String navList, String todolist) {
        super(userId, userName, email, password, ecSalt, addTime, lastLogin, lastIp, langType, agencyId, suppliersId, roleId, passportUid, yqCreateTime);
        this.actionList = actionList;
        this.navList = navList;
        this.todolist = todolist;
    }

    public AdminUserWithBLOBs() {
        super();
    }

    public String getActionList() {
        return actionList;
    }

    public void setActionList(String actionList) {
        this.actionList = actionList == null ? null : actionList.trim();
    }

    public String getNavList() {
        return navList;
    }

    public void setNavList(String navList) {
        this.navList = navList == null ? null : navList.trim();
    }

    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist == null ? null : todolist.trim();
    }
}