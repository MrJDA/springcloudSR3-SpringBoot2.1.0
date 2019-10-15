package com.oocl.user_manager.controller;

import com.oocl.commonapi.entities.User;
import com.oocl.user_manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userServiceImpl.getUsers();
    }
}
