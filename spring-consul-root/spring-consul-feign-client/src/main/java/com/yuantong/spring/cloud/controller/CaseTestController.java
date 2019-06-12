package com.yuantong.spring.cloud.controller;

import com.yuantong.spring.cloud.dto.StudentDto;
import com.yuantong.spring.cloud.service.IFeignStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/caseTestController")
public class CaseTestController {

    @Autowired
    private IFeignStudentService iFeignService;

    @RequestMapping(value = "/caseTestMethod",method = RequestMethod.GET)
    private StudentDto caseMethod(){
        return iFeignService.getAllStudentDto();
    }

    @RequestMapping(value = "/getStudentByName",method = RequestMethod.GET)
    private List<StudentDto> getStudentByName(String name){
        log.info("服务客户端查询所有同学请求信息: name={}",name);
        StudentDto studentDto = new StudentDto();
        studentDto.setName(name);
        return iFeignService.getStudentByName(studentDto);
    }
}
