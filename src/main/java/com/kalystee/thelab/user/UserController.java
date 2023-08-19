package com.kalystee.thelab.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Stream;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping(name = "test", path = "/test")
    public Collection<UserDto> testEndpoint(){
        log.info("Logger is working");
        User u = User.builder().name("name").password("pwd").build();
        return Stream.of(u).map(UserMapper.INSTANCE::toDto).toList();
    }
}
