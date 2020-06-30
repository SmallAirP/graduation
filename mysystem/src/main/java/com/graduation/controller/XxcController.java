package com.graduation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class XxcController {

    @GetMapping("/xx")
    public String s(HttpSession session){
        session.removeAttribute("loginuser");
        session.removeAttribute("isT");

        return "index";
    }
}
