package spring.clound.yiguo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value = "/caseController")
public class CaseController {

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/caseTest")
    public String caseTest(){
        return this.name;
    }
}
