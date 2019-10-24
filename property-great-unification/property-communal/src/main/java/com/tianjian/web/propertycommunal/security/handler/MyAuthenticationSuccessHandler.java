package com.tianjian.web.propertycommunal.security.handler;



import com.tianjian.web.propertycommunal.security.config.SecurityUserDetails;
import com.tianjian.web.propertycommunal.security.utils.common.ResponseUtil;
import com.tianjian.web.propertycommunal.security.utils.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @program: property-great-unification
 * @description: 登录成功处理类
 *  *               用户登录系统成功后，需要做的业务操作
 *  *               包括：1.生成token;2.将用户信息保存到redis;3.将身份存储到SecurityContext里
 * @Author: liangxiaolei
 * @Date: 2019/5/24 15:40
 */
@Component
public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {


//获得授权后可得到用户信息(jwt 方式)
        SecurityUserDetails securityUserDetails = (SecurityUserDetails)authentication.getPrincipal();
        //将身份 存储到SecurityContext里
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);
        request.getSession().setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
        String token = JwtTokenUtil.generateAccessToken(securityUserDetails);
        token = JwtTokenUtil.tokenPrefix + token;
        ResponseUtil.out(response, ResponseUtil.resultMap(200,"登录成功", token));
    }
}
