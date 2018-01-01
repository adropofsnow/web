package com.happygrowing.web.mapper;

import com.happygrowing.web.entity.ChineseWord;
import com.happygrowing.web.entity.HistoryToday;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChinessWordMapper {


    public List<ChineseWord> getChinessWord();

    Integer insertWord(ChineseWord chineseWord);

}
