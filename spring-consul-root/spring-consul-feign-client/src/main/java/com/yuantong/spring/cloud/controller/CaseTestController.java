package com.yuantong.spring.cloud.controller;

import com.yuantong.spring.cloud.model.StudentModel;
import com.yuantong.spring.cloud.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/caseTestController")
public class CaseTestController {

    @Autowired
    private IFeignService iFeignService;

    @RequestMapping(value = "/caseTestMethod",method = RequestMethod.GET)
    @ResponseBody
    private StudentModel caseMethod(){
        return iFeignService.getStudent();
    }
}
