package com.graduation.service;

import com.graduation.bean.Bill;
import com.graduation.bean.House;
import com.graduation.mapper.BillMapper;
import com.graduation.mapper.HousrMapper;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargeService {

    @Autowired
    BillMapper billMapper;

    @Autowired
    HousrMapper houseMapper;

    public Bill queryBill(String month,Integer hid){
        Integer i_month = Integer.parseInt(month);
        Bill bill = billMapper.queryBill(i_month,hid);
        return bill;
    }

    public House queryHouse(Integer uid){
        return houseMapper.getHouseByUserId(uid);
    }

    public void pay(String hid,String charge,String month){
        Integer i_hid = Integer.parseInt(hid);
        Integer i_charge = Double.valueOf(charge).intValue();
        Integer i_month = Integer.parseInt(month);
        Bill bill = new Bill();
        bill.setHid(i_hid);
        bill.setCharge(i_charge);
        bill.setMonth(i_month);
        bill.setTime(new Tool().getNowTime());
        billMapper.inSertBill(bill);
    }



}
