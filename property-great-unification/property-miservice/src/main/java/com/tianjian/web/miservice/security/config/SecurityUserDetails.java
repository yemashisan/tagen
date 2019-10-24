package com.tianjian.web.miservice.security.config;


import com.tianjian.web.entity.common.LoginUser;
import com.tianjian.web.entity.common.Role;
import com.tianjian.web.entity.system.OrdinaryUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: property-great-unification
 * @description:用户权限包装了
 * @Author: liangxiaolei
 * @Date: 2019/5/23 16:20
 */
public class SecurityUserDetails extends OrdinaryUser implements UserDetails {

    private static final long serialVersionUID = 1L;

    public SecurityUserDetails(OrdinaryUser user) {
        if(user!=null) {
            this.setUserId(user.getUserId());
            this.setLoginName(user.getLoginName());
            this.setPassword(user.getPassword());
            this.setStatus(user.getStatus());
            this.setRoles(user.getRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        List<Role> roles = this.getRoles();
        if(roles!=null&&roles.size()>0){
            for (Role role : roles) {
                authorityList.add(new SimpleGrantedAuthority(role.getName()));
            }
        }
        return authorityList;
    }

    @Override
    public String getUsername() {
        return this.getLoginName();
    }

    /**
     * 账户是否过期
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否禁用
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否过期
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否启用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}