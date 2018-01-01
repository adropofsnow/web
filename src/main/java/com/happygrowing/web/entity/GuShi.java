package com.happygrowing.web.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class GuShi {
	private int ID;
	private String title;
	private String content;
	private String name;
	
	@JSONField(format="yyyy-MM-dd")
	private Date createTime;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
