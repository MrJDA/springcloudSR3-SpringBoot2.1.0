package com.oocl.feign_user_manager.controller;

import com.oocl.commonapi.clients.message_client.MessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/consumer")
public class MessageManagerController {
    @Autowired
    private MessageClient messageClient;

    @GetMapping("/getMessageCount")
    public String getMessageInfo(){
        return messageClient.getMessageCount();
    }
}
