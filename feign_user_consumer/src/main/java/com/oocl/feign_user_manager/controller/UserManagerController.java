package com.oocl.feign_user_manager.controller;

import com.oocl.commonapi.clients.user_client.UserClient;
import com.oocl.commonapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class UserManagerController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userClient.getAllUser();
    }

    @GetMapping("/addUser")
    public Integer addUser(){
        return userClient.addUser();
    }
}
