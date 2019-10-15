package com.oocl.hystrix.service;

import com.oocl.commonapi.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
