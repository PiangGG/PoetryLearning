package com.jay.PoetryLearningServer.Controller;

import com.jay.PoetryLearningServer.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public Map UELogint(
            @RequestParam("account")String account,
            @RequestParam("password")String password)
    {

        Map result = loginService.GetUser(account,password);

        return result;
    }
}
