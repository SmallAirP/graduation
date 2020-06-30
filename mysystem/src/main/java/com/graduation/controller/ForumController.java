package com.graduation.controller;

import com.graduation.bean.Content;
import com.graduation.bean.User;
import com.graduation.service.ForumService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ForumController {

    @Autowired
    private ForumService forumService;

    @GetMapping("/content")
    public String getAllContents(HttpServletRequest request){
        List<Content> allContents = forumService.getAllContent();
        request.setAttribute("contents",allContents);
        return "forum/forum";
    }

    @PostMapping("/content/addQuestion")
    public String addQuestion(HttpSession session,
                              String hid_content){
       User user = (User) session.getAttribute("loginuser");
       forumService.addQuestion(user,hid_content);
       return "redirect:/content";
    }

    @PostMapping("/content/addAnswer")
    public String addAnswer(HttpServletRequest request,
                          HttpServletResponse response,
                          HttpSession session,
                          String answer_con,
                          String qid){
        User user = (User) session.getAttribute("loginuser");
        forumService.addAnswer(answer_con,user,Integer.parseInt(qid));
        return "redirect:/content";
    }
}
