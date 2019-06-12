package com.yuantong.spring.cloud.api;

import com.yuantong.spring.cloud.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/iStudentService")
public interface IStudentService {

    @RequestMapping(value = "/getAllStudentDto")
    StudentDto getAllStudentDto();

    @RequestMapping(value = "/getStudentByName")
    List<StudentDto> getStudentByName(@RequestBody StudentDto studentDto);
}
