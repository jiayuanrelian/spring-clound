package com.yuantong.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类
 * @author jl
 * @since 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public final class ConsulFeignClientApplication {
    private ConsulFeignClientApplication() {
    }

    /**
     * 启动方法
     * @param args 参数
     */
    public static void main(final String[] args) {
        SpringApplication.run(ConsulFeignClientApplication.class, args);
    }
}
