package com.tianjian.web.dao.miservice;


import com.tianjian.web.entity.system.OrdinaryUser;



/**
 * @program: property-great-unification
 * @description: jiekou
 * @Author: liangxiaolei
 * @Date: 2019/5/20 11:33
 */

public interface OrdinaryUserRepository/* extends CrudRepository<OrdinaryUser, Integer>*/ {
    /**
     * @param username
     * @return 返回用户
     */
    OrdinaryUser findByUsername(String username);
}
