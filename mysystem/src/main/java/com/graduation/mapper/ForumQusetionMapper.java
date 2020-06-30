package com.graduation.mapper;

import com.graduation.bean.ForumQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ForumQusetionMapper {

    @Select("select * from forum_question order by id desc")
    List<ForumQuestion> getQuestions();

    @Insert("insert into forum_question(content,time,userid) values(#{content},#{time},#{userid})")
    void addQuestion(ForumQuestion question);
}
