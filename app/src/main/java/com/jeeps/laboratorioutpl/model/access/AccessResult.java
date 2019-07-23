package com.jeeps.laboratorioutpl.model.access;

import java.util.List;

public class AccessResult {
    private boolean ok;
    private List<AccessWithRoom> permissionDB;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<AccessWithRoom> getPermissionDB() {
        return permissionDB;
    }

    public void setPermissionDB(List<AccessWithRoom> permissionDB) {
        this.permissionDB = permissionDB;
    }
}
