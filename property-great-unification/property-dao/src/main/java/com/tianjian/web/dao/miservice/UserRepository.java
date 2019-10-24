package com.tianjian.web.dao.miservice;


import com.tianjian.web.entity.system.OrdinaryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author liangxiaolei
 */
@Repository
public interface UserRepository extends JpaRepository<OrdinaryUser, UUID>, JpaSpecificationExecutor {

    OrdinaryUser findByUsername(String username);

}
