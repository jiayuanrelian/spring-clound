package com.yuantong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 * @author jl
 * @since 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public final class Application {

    private Application() {
    }
    /**
     * 启动方法
     * @param args 参数
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
