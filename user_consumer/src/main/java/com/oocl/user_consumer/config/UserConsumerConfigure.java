package com.oocl.user_consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserConsumerConfigure {

    @Bean
    public IRule getIRuleBean(){
        return new RoundRobinRule();
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplateBean(){
        return new RestTemplate();
    }
}
