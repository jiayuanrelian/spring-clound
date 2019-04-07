package spring.clound.yiguo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/getHello")
    public String getHello(){
        return "HELLO WORLD";
    }
}
