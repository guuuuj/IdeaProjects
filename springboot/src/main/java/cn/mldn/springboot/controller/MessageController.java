package cn.mldn.springboot.controller;

import cn.mldn.remoteapi.IMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-17
 */
@RestController
public class MessageController {
    @Resource
    private IMessage imsg;
    @RequestMapping("/info")
    public String info(String msg){
        return this.imsg.echo(msg);
    }
}
