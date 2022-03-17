package com.jay.PoetryLearningServer.Service;

import com.jay.PoetryLearningServer.dao.UserMapper;
import com.jay.PoetryLearningServer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;

    public Map GetUser(String account,String password)
    {
        User user=userMapper.selectByAccount(account);

        Map map=new HashMap();

        if (user.getPassword().endsWith(password))
        {
            //密码正确
            Map map1=new HashMap();
            map1.put("isLogin","success");

            Map map2=new HashMap();
            map2.put("username",user.getUsername());
            map2.put("level",user.getLevel());

            map1.put("userinfo",map2);

            map.put("result",map1);
        }else
        {
            //密码错误
            Map map1=new HashMap();
            map1.put("isLogin","fail");
            map.put("result",map1);
        }
        return map;
    }
}
