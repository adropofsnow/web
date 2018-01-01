package com.happygrowing.web.service;


import com.happygrowing.web.entity.ChineseWord;
import com.happygrowing.web.mapper.ChinessWordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChinessWordService {

    @Autowired
    ChinessWordMapper chinessWordMapper;


    public Integer insertWord(ChineseWord chineseWord) {


        Integer result =  chinessWordMapper.insertWord(chineseWord);
        return result;
    }


}
