package spring.clound.yiguo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceEurekaConfigGitserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaConfigGitserverApplication.class, args);
    }

}
