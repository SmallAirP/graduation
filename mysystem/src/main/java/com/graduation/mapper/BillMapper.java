package com.graduation.mapper;

import com.graduation.bean.Bill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BillMapper {

    @Insert("insert into Bill(hid,charge,time,month) values(#{hid},#{charge},#{time},#{month})")
    void inSertBill(Bill bill);

    @Select("select * from bill where month=#{month} and hid=#{hid}")
    Bill queryBill(Integer month,Integer hid);



}
