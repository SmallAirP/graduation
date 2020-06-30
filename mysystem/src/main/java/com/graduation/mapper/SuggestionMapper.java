package com.graduation.mapper;

import com.graduation.bean.Suggestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SuggestionMapper {

    @Insert("insert into suggestion(sname,sphone,smail,scontent,stime) values(#{sname},#{sphone},#{smail},#{scontent},#{stime})")
    void addSuggestion(Suggestion sgt);
}
