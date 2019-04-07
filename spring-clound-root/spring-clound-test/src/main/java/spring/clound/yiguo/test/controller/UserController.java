package spring.clound.yiguo.test.controller;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.clound.yiguo.test.model.UserModel;
import spring.clound.yiguo.test.service.IUserService;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    List<UserModel> getAllUser(){
        return  iUserService.getAllUser();
    };

    void deletUser(Integer id){
        iUserService.deletUser(id);
    };
}
