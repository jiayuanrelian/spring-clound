package spring.cloud.yiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceEurekaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaOrderApplication.class, args);
    }

}
