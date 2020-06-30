package com.graduation.controller;

import com.graduation.bean.Suggestion;
import com.graduation.service.SuggestionService;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SuggestionController {

    @Autowired
    private SuggestionService service;

    @PostMapping("/addSuggsetion")
    public String addSuggsetion(String name,String phone_n,String mail,String message){
        Suggestion sg = new Suggestion();
        sg.setSname(name);
        sg.setSphone(phone_n);
        sg.setSmail(mail);
        sg.setScontent(message);
        sg.setStime(new Tool().getNowTime());

        service.addSuggestion(sg);
        return "redirect:/index.html";
    }
}
