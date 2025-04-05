package com.example.Teachers.controller;

import com.example.Teachers.Model.User;
import com.example.Teachers.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public int register(@RequestBody User user)
    {
        return authService.saveUser(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        User user1=authService.findUserByUserName(user.getUsername());
        if(!Objects.isNull(user1) && user1.getUsername().equals(user.getUsername())){
            return "Successfully Login";
        }
        else {
            return "No username Found";
        }
    }
}
