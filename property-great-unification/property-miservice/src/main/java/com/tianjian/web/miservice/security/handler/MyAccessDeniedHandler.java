package com.tianjian.web.miservice.security.handler;



import com.tianjian.web.miservice.security.utils.common.ResponseUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: property-great-unification
 * @description:     权限不足处理类
 *  *               自定义权限不足需要做的业务操作
 *  *               包括：处理权限不足的逻辑
 * @Author: liangxiaolei
 * @Date: 2019/5/24 16:08
 */
@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException)
    {
        StringBuffer msg = new StringBuffer("请求: ");
        msg.append(request.getRequestURI()).append(" 权限不足，无法访问该资源.");
        System.out.println(msg.toString());

        ResponseUtil.out(response, ResponseUtil.resultMap(402,"权限不足，无法访问该资源"));
    }

}
