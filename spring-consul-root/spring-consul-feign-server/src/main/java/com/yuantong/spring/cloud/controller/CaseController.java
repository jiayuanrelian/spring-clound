package com.yuantong.spring.cloud.controller;

import com.yuantong.spring.cloud.api.IStudentService;
import com.yuantong.spring.cloud.dto.StudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 这里Feign参数的绑定是，@RequestMapping方法上的注解不用添加
 * 但是方法参数里的@RequestBody注解需要加上，否则参数信息传递不过来
 * DTO对象里面要保证有无参构造函数，才能保证参数信息传递过来
 * @author jl
 * @since 0.0.1
 */
@Slf4j
@RestController
public class CaseController implements IStudentService {

    private static List<StudentDto> STUDENT_DTO_LIST = new ArrayList<>();
    static {
        StudentDto studentDto = new StudentDto();
        studentDto.setName("LILY");
        studentDto.setAddress("JAPAN");
        studentDto.setMobile("911");
        STUDENT_DTO_LIST.add(studentDto);
        StudentDto studentDto1 = new StudentDto();
        studentDto1.setName("LILY1");
        studentDto1.setAddress("JAPAN");
        studentDto1.setMobile("911");
        STUDENT_DTO_LIST.add(studentDto1);
    }

    /**
     *
     * @return StudentDto
     */
    @Override
    public StudentDto getAllStudentDto() {
        StudentDto studentDto = new StudentDto();
        studentDto.setName("LILY");
        studentDto.setAddress("JAPAN");
        studentDto.setMobile("911");
        return studentDto;
    }

    /**
     *
     * @param studentDto 查询条件对象
     * @return 符合条件对象集合
     */
    @Override
    public List<StudentDto> getStudentByName(@RequestBody final StudentDto studentDto) {
        log.info("服务客户端查询所有同学请求信息: StudentDto={}", studentDto.toString());
        return STUDENT_DTO_LIST.stream().filter(x->x.getName().equals(studentDto.getName())).collect(Collectors.toList());
    }
}
