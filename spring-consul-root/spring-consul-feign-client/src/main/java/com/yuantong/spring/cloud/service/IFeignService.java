package com.yuantong.spring.cloud.service;

import com.yuantong.spring.cloud.model.StudentModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "springcloud-provider",path = "/caseController")
public interface IFeignService {

    @RequestMapping(value = "/getStudent" ,method = RequestMethod.GET)
    @ResponseBody
    public StudentModel getStudent();
}
