package com.yuantong.spring.cloud.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 学生信息对象
 * @author jl
 * @since 0.0.1
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class StudentDto {
    private String name;
    private String mobile;
    private String address;


}
