package com.gu;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-20
 */
public class TestLoginDemo {
    public static void main(String[] args){
        /*//这里面有SecurityManager接口对象的方法
        Factory factory;
        org.apache.shiro.mgt.SecurityManager sm;*/
        //取的Factory接口对象，主要目的是通过配置文件加载文件之中的信息，这些信息暂时不能够成为认证信息
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:META-INF/shiro.ini");
        //取得里面所保存的所有的认证数据信息
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        //利用一个专门的认证操作的处理类，实现认证处理的具体实现
        SecurityUtils.setSecurityManager(securityManager);
        //获取进行用户名和密码认证的接口对象
        Subject currentUser = SecurityUtils.getSubject();
        //定义了一个token，里面保存了要登录的用户名和信息
        UsernamePasswordToken token = new UsernamePasswordToken("admin","hello");
        //实现用户登录处理
        currentUser.login(token);
        //取的用户名
        System.out.println(currentUser.getPrincipal());
    }
}


