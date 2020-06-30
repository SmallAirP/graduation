package com.graduation.service;

import com.graduation.bean.News;
import com.graduation.mapper.NewsMapper;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    NewsMapper newsMapper;

    public List<News> getAllNews(){
        return new Tool().changeNewsListTime(newsMapper.getAllNews());
    }

    public News getNewsById(Integer id){
        News news = newsMapper.getNewsById(id);
        news.setTime(new Tool().toTime(news.getTime()));
        return news;
    }
}
