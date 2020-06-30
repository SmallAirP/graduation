package com.graduation.service;

import com.graduation.bean.Suggestion;
import com.graduation.mapper.SuggestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuggestionService {

    @Autowired
    private SuggestionMapper mapper;

    public void addSuggestion(Suggestion sgt){
        mapper.addSuggestion(sgt);
    }
}
