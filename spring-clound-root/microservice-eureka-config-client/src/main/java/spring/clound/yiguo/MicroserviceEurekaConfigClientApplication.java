package spring.clound.yiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class MicroserviceEurekaConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaConfigClientApplication.class, args);
    }

}
