package com.oocl.user_manager.service.impl;

import com.oocl.commonapi.entities.User;
import com.oocl.user_manager.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        return Arrays.asList(new User("张三", 12, "dbSource2"), new User("李四", 13, "dbSource2"));
    }
}
