package com.happygrowing.web.controller;


import com.happygrowing.web.entity.ChineseWord;
import com.happygrowing.web.entity.Result;
import com.happygrowing.web.service.ChinessWordService;
import com.happygrowing.web.service.GuShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudyController {

    @Autowired
    private ChinessWordService chinessWordService;

    @Autowired
    private GuShiService guShiService;

    @RequestMapping( "/addChinessWord")
    @ResponseBody
    public String addChinessWord(ChineseWord chineseWord){

        Result result = new Result();


        chinessWordService.insertWord(chineseWord);


        return "OK";
    }



    

}
