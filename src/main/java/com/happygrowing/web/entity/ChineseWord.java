package com.happygrowing.web.entity;

import java.util.Date;

public class ChineseWord {

    public Integer id;

   private String word;
   private Date createTime;
   Integer rightNum;
   Integer wrongNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRightNum() {
        return rightNum;
    }

    public void setRightNum(Integer rightNum) {
        this.rightNum = rightNum;
    }

    public Integer getWrongNum() {
        return wrongNum;
    }

    public void setWrongNum(Integer wrongNum) {
        this.wrongNum = wrongNum;
    }
}
