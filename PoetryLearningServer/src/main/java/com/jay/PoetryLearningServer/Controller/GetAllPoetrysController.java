package com.jay.PoetryLearningServer.Controller;

import com.jay.PoetryLearningServer.Service.SelectPoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetAllPoetrysController {
    @Autowired
    SelectPoetryService selectPoetryService;
    @PostMapping("/GetAllPoetrys")
    public Map GetAllPoetrys()
    {
        Map result = selectPoetryService.GetPoetrys();
        return result;
    }
}
