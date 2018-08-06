package com.cn.service.impl;

import cn.mldn.remoteapi.IMessage;
import org.springframework.stereotype.Component;

@Component
public class MessageImpl implements IMessage {
    public String echo(String msg) {
        return "echo" + msg;
    }
}
