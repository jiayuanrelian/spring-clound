package spring.cloud.yiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceEurekaHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaHystrixDashboardApplication.class, args);
    }

}
