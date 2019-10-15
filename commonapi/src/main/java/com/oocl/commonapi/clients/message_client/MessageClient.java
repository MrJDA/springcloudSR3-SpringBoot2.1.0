package com.oocl.commonapi.clients.message_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "message-service")
public interface MessageClient {

    @GetMapping("/message/getMessageCount")
    String getMessageCount();
}
