package com.jay.PoetryLearningServer.Service;

import com.jay.PoetryLearningServer.dao.UserMapper;
import com.jay.PoetryLearningServer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterService {
    @Autowired
    UserMapper userMapper;

    public Map RegisterUser(String Account,String Password,String Username)
    {
        User user=new User();
        user.setAccount(Account);
        user.setUsername(Username);
        user.setPassword(Password);
        user.setLevel(0);
        int id = userMapper.insert(user);

        Map map=new HashMap();
        map.put("user",user);
        map.put("result",true);
        return map;
    }
}
