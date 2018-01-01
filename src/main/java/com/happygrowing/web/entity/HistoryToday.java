package com.happygrowing.web.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class HistoryToday {
	private int ID;
	private String title;
	private String content;
	
	@JSONField(format="yyyy-MM-dd")
	private Date historyTime;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getHistoryTime() {
		return historyTime;
	}
	public void setHistoryTime(Date historyTime) {
		this.historyTime = historyTime;
	}
	
}
