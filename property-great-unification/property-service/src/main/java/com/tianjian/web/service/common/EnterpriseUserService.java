package com.tianjian.web.service.common;


import com.tianjian.web.dao.common.EnterpriseUserRepository;
import com.tianjian.web.entity.system.EnterpriseUser;
import com.tianjian.web.entity.system.OrdinaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:UserService
 * @Description:TODO
 * @author:liangxiaolei
 * @date:2019/5/24 11:37
 * @Version V1.0
 */
@Service
public class EnterpriseUserService {
    @Autowired
    private EnterpriseUserRepository userRepository;

    public OrdinaryUser create(OrdinaryUser user) throws Exception{

        //check that the username already exists
        if(user.getLoginName() == null) {
            throw new Exception("User2 name can not null");
        }
        if(userRepository.findByUsername(user.getLoginName()) != null) {
            throw new Exception(String.format("User2 %S alrady exist" , user.getRealName()));
        }

        //check userRole
      /*  if(user.getRole() != null) {
            if (!user.getRole().equals(UserRole.ROLE_LOWER.getValue()) && !user.getRole().equals(UserRole.ROLE_SENIOR.getValue()) && !user.getRole().equals(UserRole.ROLE_INTERMEDIATE.getValue())) {
                throw new Exception(String.format("User2 Role %s is invalid", user.getRole()));
            }
        } else {
            throw new Exception("User2 role can not null");
        }*/

        //return userRepository.save(user);
        return null;
    }

//    public User2 getUserById(UUID id) {
////
////        return userRepository.findById(id).get();
////
////    }

  public EnterpriseUser findByUsername(String name) {

       return userRepository.findByUsername(name);

   }
////
////    public List<User2> getAllUser() {
////
////        return userRepository.findAll();
////
////    }
}
