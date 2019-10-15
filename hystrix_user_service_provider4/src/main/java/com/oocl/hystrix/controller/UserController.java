package com.oocl.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.oocl.commonapi.entities.User;
import com.oocl.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping("/getAllUser")
    @HystrixCommand(fallbackMethod = "getAllUserError")
    public List<User> getAllUser(){
        if(true)  throw new RuntimeException("error");
        return userServiceImpl.getUsers();
    }

    public List<User> getAllUserError(){
        return Arrays.asList(new User("noting", 0, "nothing"));
    }
}
