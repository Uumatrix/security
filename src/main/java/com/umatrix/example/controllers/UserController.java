package com.umatrix.example.controllers;

import com.umatrix.example.models.Users;
import com.umatrix.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String logIn(@RequestBody Users user) {
        return userService.verify(user);
    }

}
