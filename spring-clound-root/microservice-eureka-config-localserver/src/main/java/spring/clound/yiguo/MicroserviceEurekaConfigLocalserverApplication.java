package spring.clound.yiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceEurekaConfigLocalserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaConfigLocalserverApplication.class, args);
    }

}
