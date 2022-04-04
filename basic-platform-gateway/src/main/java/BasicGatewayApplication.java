import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScans;

/**
 * purpose:基础网关服务启动类
 *
 * @author Pan Liuyang
 * 2022/4/4 17:36
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BasicGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicGatewayApplication.class, args);
        System.out.println("基础网关服务启动");
    }
}
