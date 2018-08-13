package mqdemo.consumer;

import cn.mldn.remoteapi.IMessage;
import org.apache.activemq.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：（）
 * @Date: Created in  2018-08-13
 */
@Component
public class ConsumerMessageListener implements MessageListener {
    @Autowired
    private IMessage message;
    public void onMessage(javax.jms.Message message) {
        if(message instanceof TextMessage){ //如果现在所发送的是一个文本消息
            TextMessage textMsg = (TextMessage) message;//转变为文本消息
            try {
                System.out.println("********"+this.message.echo(textMsg.getText()));
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
