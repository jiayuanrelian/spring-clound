package com.yuantong.spring.cloud.api;

import com.yuantong.spring.cloud.dto.StudentDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 学生信息服务接口
 * @author jl
 * @since 0.0.1
 */
@RequestMapping(value = "/iStudentService")
public interface IStudentService {

    /**
     * 获取所用学生信息
     * @return StudentDto
     */
    @RequestMapping(value = "/getAllStudentDto")
    StudentDto getAllStudentDto();

    /**
     * 通过名字查询学生信息
     * @param studentDto 查询条件对象
     * @return  符合条件对象集合
     */
    @RequestMapping(value = "/getStudentByName")
    List<StudentDto> getStudentByName(@RequestBody StudentDto studentDto);
}
