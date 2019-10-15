package com.oocl.message_service.service.impl;

import com.oocl.message_service.service.MessageService;
import org.apache.commons.lang.StringUtils;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private String message;
    @Override
    public String getMessageCount() {
        if(StringUtils.isEmpty(this.message) || this.message == null)return  null;
        return this.message;
    }
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("exchange"),
            key = "routingKey1",
            value = @Queue("myQueue")
    ))
    public void getMessageFromUserService(String message){
        this.message = message;
    }
}
