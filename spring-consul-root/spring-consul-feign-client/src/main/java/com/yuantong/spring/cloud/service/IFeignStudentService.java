package com.yuantong.spring.cloud.service;

import com.yuantong.spring.cloud.api.IStudentService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 服务接口
 * @author jl
 * @since 0.0.1
 */
@FeignClient(value = "springcloud-provider")
public interface IFeignStudentService extends IStudentService {

}
