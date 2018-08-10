import cn.mldn.remoteapi.IMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Gj
 * @system name:
 * @copyright：
 * @Date: Created in  2018-08-10
 */
@ContextConfiguration(locations = {"classpath:spring-dubbo-consumer.xml"})
public class TestMessage extends AbstractJUnit4SpringContextTests {
    @Autowired
    IMessage messageImpl;

    @DirtiesContext
    @Test
    public void testEcho(){
        this.messageImpl.echo("www.mldn.cn");
    }
}
