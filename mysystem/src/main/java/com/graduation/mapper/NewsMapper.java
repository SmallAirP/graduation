package com.graduation.mapper;

import com.graduation.bean.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface NewsMapper {

    @Select("select * from news order by id desc")
    List<News> getAllNews();

    @Select("select * from news where id=#{id}")
    News getNewsById(Integer id);
}
