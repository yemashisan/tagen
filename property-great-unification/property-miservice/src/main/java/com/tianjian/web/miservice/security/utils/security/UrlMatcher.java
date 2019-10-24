package com.tianjian.web.miservice.security.utils.security;

/**
 * @program: property-great-unification
 * @description: 路径匹配
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:12
 */
public interface UrlMatcher {
    Object compile(String paramString);
    boolean pathMatchesUrl(Object paramObject, String paramString);
    String getUniversalMatchPattern();
    boolean requiresLowerCaseUrl();
}
