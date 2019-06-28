package com.yuantong.spring.cloud.controller;

import com.yuantong.spring.cloud.dto.StudentDto;
import com.yuantong.spring.cloud.service.IFeignStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
/**
 * 控制类
 * @author jl
 * @since 0.0.1
 */
@Slf4j
@RestController
@RequestMapping(value = "/caseTestController")
public class CaseTestController {

    @Autowired
    private IFeignStudentService iFeignService;

    /**
     *
     * @return StudentDto
     */
    @RequestMapping(value = "/caseTestMethod", method = RequestMethod.GET)
    private StudentDto caseMethod(){
        return iFeignService.getAllStudentDto();
    }

    /**
     *
     * @param name 名字
     * @return StudentDto
     */
    @RequestMapping(value = "/getStudentByName", method = RequestMethod.GET)
    private List<StudentDto> getStudentByName(final String name){
        log.info("服务客户端查询所有同学请求信息: name={}", name);
        StudentDto studentDto = new StudentDto();
        studentDto.setName(name);
        return iFeignService.getStudentByName(studentDto);
    }
}
