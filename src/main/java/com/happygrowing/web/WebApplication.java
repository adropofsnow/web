package com.happygrowing.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan
@MapperScan("com.happygrowing.web.*")
public class WebApplication {

	@RequestMapping("/")
	public String greeting(){
		return "zzq";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
