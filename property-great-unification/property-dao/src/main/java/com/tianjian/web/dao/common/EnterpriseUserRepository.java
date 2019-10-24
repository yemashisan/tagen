package com.tianjian.web.dao.common;


import com.tianjian.web.entity.system.EnterpriseUser;


/**
 * @program: property-great-unification
 * @description: jiekou
 * @Author: liangxiaolei
 * @Date: 2019/5/20 11:33
 */

public interface EnterpriseUserRepository {
    /**
     * @param username
     * @return 返回用户
     */
    EnterpriseUser findByUsername(String username);
}
