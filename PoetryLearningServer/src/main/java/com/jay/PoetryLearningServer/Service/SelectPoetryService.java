package com.jay.PoetryLearningServer.Service;

import com.jay.PoetryLearningServer.dao.PoetryMapper;
import com.jay.PoetryLearningServer.entity.Poetry;
import com.jay.PoetryLearningServer.entity.PoetryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SelectPoetryService {

    @Autowired
    PoetryMapper poetryMapper;

    public Map GetPoetrys()
    {
        PoetryExample poetryExample=new PoetryExample();

        Map map = new HashMap();
        for (int i=0;i<poetryMapper.countByExample(poetryExample);i++)
        {
            map.put(i,poetryMapper.selectByPrimaryKey(i));
        }

        return map;
    }
}
