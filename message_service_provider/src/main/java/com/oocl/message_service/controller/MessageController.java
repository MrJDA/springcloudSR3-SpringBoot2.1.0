package com.oocl.message_service.controller;

import com.oocl.message_service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageServiceImpl;

    @GetMapping("/getMessageCount")
    public String getMessageCount(){
        return messageServiceImpl.getMessageCount();
    }
}
