package com.cn.service.demo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description: dubbo启动
 * @Author: Gj
 * @system name:
 * @copyright：长安新生（深圳）金融投资有限公司
 * @Date: Created in  2018-08-08
 */
public class ProviderStartup {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-common.xml");
        System.out.println(context.getDisplayName()+"::her");
        context.start();
        System.out.println("start");
        System.in.read();
    }
}

