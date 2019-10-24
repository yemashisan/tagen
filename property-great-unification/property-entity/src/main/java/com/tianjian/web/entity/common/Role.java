package com.tianjian.web.entity.common;


import java.util.List;
/**
 * @program: property-great-unification
 * @description: 角色类
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:12
 */
public class Role  {

    private Integer id ;
    private String name;
    private List<Menu> menus;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
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
        this.name = name;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
