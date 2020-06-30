package com.graduation.service;

import com.graduation.bean.House;
import com.graduation.mapper.HousrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HousrMapper house_mapper;


    public List<House> getHouses(Integer u_id,Integer month){
        List<House> allHouses = house_mapper.getAllHouses(u_id,month);

        System.out.println(allHouses);
        return allHouses;
    }

    public void createHouse(House house){
        house_mapper.insertData(house);
    }
}
