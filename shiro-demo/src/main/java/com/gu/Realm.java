package com.gu;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-21
 */
public interface Realm{

    /**
     * 只是要求返回一个当前使用的Realm名字，这个名字可以任意返回，但是不要重名
     * @return:
     */
    public String getName();

    /**
     *  判断你当前使用的token的类型是否为指定的类型
     */
    public boolean supports(AuthenticationToken token);

    /**
     * 得到用户的认证信息，根据传入的token取的
     * token包含了要进行验证的所有数据
     * @return:
     */
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException;
}
