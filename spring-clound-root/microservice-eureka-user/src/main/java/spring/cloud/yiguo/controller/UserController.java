package spring.cloud.yiguo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/userController")
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(){
        return "helloWorld";
    }

    @RequestMapping(value = "/getUserOrderInfo/{id}")
    @HystrixCommand(fallbackMethod = "fallbackMethodCase")
    public String getUserOrderInfo(@PathVariable String id){

    return this.restTemplate.getForObject("http://microservice-eureka-order/orderController/getUserOrder/123",String.class);
    }

    public String fallbackMethodCase(String id){
        return "服务不可用....";
    }

}
