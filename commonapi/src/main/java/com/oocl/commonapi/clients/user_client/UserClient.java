package com.oocl.commonapi.clients.user_client;

import com.oocl.commonapi.entities.User;
import com.oocl.commonapi.fallback_factory.user_fallback_factory.UserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="user-service-provider", fallbackFactory = UserFallbackFactory.class)
public interface UserClient {

    @GetMapping("/user/getAllUser")
    List<User> getAllUser();

    @GetMapping("/user/addUser")
    Integer addUser();
}
