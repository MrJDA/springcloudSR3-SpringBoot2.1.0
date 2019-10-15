package com.oocl.hystrix.service.impl;

import com.oocl.commonapi.entities.User;
import com.oocl.hystrix.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        return Arrays.asList(new User("张三", 12, "dbSource3"), new User("李四", 13, "dbSource3"));
    }
}
