package spring.cloud.yiguo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.yiguo.model.OrderInfo;

@RestController
@RequestMapping(value = "/orderController")
public class OrderController {

    @RequestMapping(value = "/getUserOrder/{orderId}")
    private OrderInfo getUserOrder(@PathVariable String orderId){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId("123");
        orderInfo.setOrderName("kuaidi");
        orderInfo.setCity("shanghai");
        return orderInfo;
    }
}
