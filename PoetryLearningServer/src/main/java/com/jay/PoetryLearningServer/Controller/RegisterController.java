package com.jay.PoetryLearningServer.Controller;

import com.jay.PoetryLearningServer.Service.RegisterService;
import com.jay.PoetryLearningServer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/register")
    public Map UERegister(
            @RequestParam("account")String account,
            @RequestParam("password")String password,
            @RequestParam("username")String username)
    {
        Map user = registerService.RegisterUser(account,password,username);

        return user;
    }
}
