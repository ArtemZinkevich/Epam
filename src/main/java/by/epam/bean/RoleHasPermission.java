package by.epam.bean;

import java.io.Serializable;

public class RoleHasPermission extends Model {

    private Permission permission;

    public RoleHasPermission() {
    }

    public RoleHasPermission(int id) {
        super(id);
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleHasPermission)) return false;

        RoleHasPermission that = (RoleHasPermission) o;

        return permission != null ? permission.equals(that.permission) : that.permission == null;
    }

    @Override
    public int hashCode() {
        return permission != null ? permission.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RoleHasPermission{" +
                "permission=" + permission +
                '}';
    }
}
