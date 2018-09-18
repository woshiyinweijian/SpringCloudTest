package cn.ywj.eurekaprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/test")
    public Object test(){
        return 0;
    }
}
