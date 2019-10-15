package com.oocl.user_consumer.controller;

import com.oocl.commonapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user/consumer")
public class UserConsumerController {
    private final String url = "http://user-service-provider";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return restTemplate.getForObject(url+"/user/getAllUser", List.class);
    }
}
