import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description: Hallo World
 * @Author: Gj
 * @system name:
 * @copyright：
 * @Date: Created in  2018-08-10
 */
@SpringBootApplication
@ImportResource("classpath:META-INF/spring/spring-dubbo-consumer.xml")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
