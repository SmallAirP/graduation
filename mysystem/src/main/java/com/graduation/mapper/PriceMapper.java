package com.graduation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.omg.CORBA.INTERNAL;

@Mapper
public interface PriceMapper {

    @Select("select price from price where month = #{month}")
    Float getPriceByMonth(Integer month);
}
