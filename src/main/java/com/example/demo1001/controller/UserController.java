package com.example.demo1001.controller;

import com.example.demo1001.domain.User;
import com.example.demo1001.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "用户信息")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/userlist")
    public List<User> userlist() {
        return userService.list();
    }

    @PostMapping("/addUser")
    public void addUser(User user){
        userService.save(user);
    }
}
