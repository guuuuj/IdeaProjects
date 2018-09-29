package com.gu.realm;

import com.gu.Realm;
import org.apache.shiro.authc.*;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-21
 */
public class MyRealm implements Realm{
    public String getName() {
        //名字随便给一个，只要能唯一标记即可
        return "MyRealm";
    }

    public boolean supports(AuthenticationToken token) {
        // 本次将在之前的程序的基础上继续使用UsernamePasswordToken完成信息的传递
        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();//取的用户名
        String password = new String ((char[])token.getCredentials());//取的密码
        // 此时直接使用一个固定的用户名和密码进行验证处理操作
        if(!"admin".equals(username)){//判断用户名是否存在
            throw new UnknownAccountException("用户名不存在！");
        }
        if(!"hello".equals(password)){
            throw new IncorrectCredentialsException("密码错误！");
        }
        return new SimpleAuthenticationInfo(username,password,this.getName());
    }
}
