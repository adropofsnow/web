package com.happygrowing.web.controller;


import com.happygrowing.web.entity.GuShi;
import com.happygrowing.web.entity.HistoryToday;
import com.happygrowing.web.service.GuShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class MoviceController {

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;




    @RequestMapping("/showEveryDay")
    public String showEveryDay(){
        return "showEveryDay";
    }

    @RequestMapping("/reviewChinese")
    public String reviewChinese(ModelAndView view){

        view.addObject("hello","zzq");
        return "reviewChinese";
    }

    @RequestMapping(value="hello/{name}", method = RequestMethod.GET)
    public @ResponseBody  GuShi getShopInJSON(@PathVariable String name,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");

        GuShi gushi = new GuShi();

        gushi.setContent("aaa");
        gushi.setTitle("zzq");
        return gushi;
    }



    @RequestMapping("/addWord")
    public String addWord(){
        return "addWord";
    }



}
