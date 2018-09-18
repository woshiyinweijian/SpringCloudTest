package cn.ywj.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/test")
    public Object test(){
        return restTemplate.getForObject("http://EUREKA-PROVIDER/test", String.class);// 请求eureka-provider
    }
}
