package com.oocl.user_manager.service.impl;

import com.oocl.commonapi.entities.User;
import com.oocl.user_manager.service.UserService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private int count = 0;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Override
    public List<User> getUsers() {
        return Arrays.asList(new User("张三", 12,"dbSource1"), new User("李四", 13, "debSource1"));
    }

    @Override
    public Integer addUser() {
        count++;
        //第一个参数是exchange，第二个参数是routingkey，第三个参数是发送的消息message
        rabbitTemplate.convertAndSend("exchange", "routingKey1", "now " + LocalDateTime.now().toString()+ " count:"+ count);
        return count;
    }
}
