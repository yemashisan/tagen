package com.tianjian.web.entity.common;

import java.util.List;

/**
 * @ClassName:LoginUser
 * @Description:登录类，仅仅携带用户id，用户名，密码等
 * @author:liangxiaolei
 * @date:2019/5/24 15:34
 * @Version V1.0
 */
public class LoginUser {
    private Integer userid;
    private String name;
    private String password;
    private Integer status;
    private List<Role> roles;

    public LoginUser() {
    }

    public LoginUser(Integer userid, String name, String password, Integer status) {
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
