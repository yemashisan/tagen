package com.tianjian.web.propertycommunal.security.handler;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @program: property-great-unification
 * @description:    认证失败处理类
 *  *               在访问一个受保护的资源，用户没有通过登录认证
 * @Author: liangxiaolei
 * @Date: 2019/5/24 16:01
 */
@Component
public class MyAuthenticationEntryPointHandler implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        StringBuffer msg = new StringBuffer("请求访问: ");
        msg.append(httpServletRequest.getRequestURI()).append(" 接口，因为认证失败，无法访问系统资源.");
        System.out.println(msg.toString());
        httpServletResponse.addHeader("message0","接口，因为认证失败，无法访问系统资源");
    }
}
