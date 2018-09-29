import cn.mldn.mqprovider.producer.IMessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Gj
 * @system name: 工作流管理系统
 * @copyright：长安新生（深圳）金融投资有限公司
 * @Date: Created in  2018-08-17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/spring-common.xml")
public class TestMessageSend  {
    @Resource
    private IMessageProducer messageProducer;

    @Test
    public void testMessageSend(){
        this.messageProducer.sendMessage("不被环境所改变");
    }
}
