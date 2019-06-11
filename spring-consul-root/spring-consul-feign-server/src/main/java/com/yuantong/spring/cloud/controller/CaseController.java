package com.yuantong.spring.cloud.controller;

import com.yuantong.spring.cloud.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/caseController")
public class CaseController {

    @RequestMapping(value = "/getStudent" ,method = RequestMethod.GET)
    @ResponseBody
    public StudentModel getStudent() {
        StudentModel studentModel = new StudentModel();
        studentModel.setName("LILY");
        studentModel.setAddress("USA");
        studentModel.setMobile("911");
        return studentModel;
    }
}
