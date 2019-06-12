package com.yuantong.spring.cloud.service;

import com.yuantong.spring.cloud.api.IStudentService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "springcloud-provider")
public interface IFeignStudentService extends IStudentService {

}
