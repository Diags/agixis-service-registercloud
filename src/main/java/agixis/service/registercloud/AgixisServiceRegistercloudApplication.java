package agixis.service.registercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AgixisServiceRegistercloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgixisServiceRegistercloudApplication.class, args);
    }

}
