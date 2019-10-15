package com.oocl.gateway.configure;

import com.netflix.zuul.ZuulFilter;
import com.oocl.gateway.custom_filter.PreFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigure {

    @Bean
    public ZuulFilter preFilter(){
        return new PreFilter();
    }
}
