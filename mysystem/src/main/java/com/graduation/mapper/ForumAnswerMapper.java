package com.graduation.mapper;

import com.graduation.bean.ForumAnswer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ForumAnswerMapper {

    @Select("select * from forum_answer where qid=#{id} order by qid desc ")
    List<ForumAnswer> getAnswerByQid(int id);

    @Insert("insert into forum_answer(content,time,userid,qid) values(#{content},#{time},#{userid},#{qid})")
    void addAnswer(ForumAnswer answer);
}
