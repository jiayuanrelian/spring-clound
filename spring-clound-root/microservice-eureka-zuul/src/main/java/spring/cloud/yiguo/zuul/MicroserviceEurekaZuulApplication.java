package spring.cloud.yiguo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceEurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaZuulApplication.class, args);
    }

}
