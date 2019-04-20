package spring.cloud.yiguo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userController")
public class UserController {

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(){
        return "helloWorld";
    }

}
