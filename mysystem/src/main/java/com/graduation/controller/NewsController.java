package com.graduation.controller;

import com.graduation.bean.News;
import com.graduation.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class NewsController {

    @Autowired
    NewsService newsService;
    
    @GetMapping("/news")
    public String news(HttpServletRequest request,String id){
        Integer newsid = Integer.parseInt(id);
        List<News> allNews = newsService.getAllNews();
        request.setAttribute("newsList",allNews);
        if (newsid==0){

            request.setAttribute("onenews",allNews.get(0));

            return "news";
        }else{
            News newsById = newsService.getNewsById(newsid);
            request.setAttribute("onenews",newsById);
            return "news";
        }

    }

}
