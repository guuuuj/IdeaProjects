package cn.mldn.mqprovider.producer.impl;

import cn.mldn.mqprovider.producer.IMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.print.attribute.standard.Destination;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-16
 */
@Component
public class MessageProducerImpl implements IMessageProducer{
    @Resource
    private JmsTemplate jmsTemplate;
    @Resource
    private Destination destination;//设置消息目的地

    public void sendMessage(String msg) {
        this.jmsTemplate.send(this.destination,new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
}
