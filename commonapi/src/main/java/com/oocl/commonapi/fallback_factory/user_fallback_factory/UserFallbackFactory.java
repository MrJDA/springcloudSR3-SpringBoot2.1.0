package com.oocl.commonapi.fallback_factory.user_fallback_factory;

import com.oocl.commonapi.clients.user_client.UserClient;
import com.oocl.commonapi.entities.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            @Override
            public List<User> getAllUser() {
                return Arrays.asList(new User("nothing1", 0, "nothing1"));
            }

            @Override
            public Integer addUser() {
                return null;
            }
        };
    }
}
