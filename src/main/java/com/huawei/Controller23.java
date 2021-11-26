package com.huawei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller23 {

    @PostMapping("/test231")
    public User test3(@RequestBody User user) {
        user.setUserID(user.getUserID()+1000);
        user.setName(user.getName()+"chener");
        user.setAge(user.getAge()-10);
        return user;
    }
}
