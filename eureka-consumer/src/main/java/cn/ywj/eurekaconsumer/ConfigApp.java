package cn.ywj.eurekaconsumer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigApp {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate () {
        return new RestTemplate() ;
    }
}
