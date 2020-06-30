package com.graduation.mapper;

import com.graduation.bean.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HousrMapper {

    @Select("select * from house where u_id=#{u_id} and pay_time < #{month}")
    List<House> getAllHouses(Integer u_id,Integer month);

    @Insert("insert into house(unit,floor,number,area,uid) values(#{unit},#{floor},#{number},#{area},#{uid})")
    void insertData(House house);

    @Select("select * from house where uid=#{uid}")
    House getHouseByUserId(Integer uid);
}
