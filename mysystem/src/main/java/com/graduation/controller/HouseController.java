package com.graduation.controller;

import com.graduation.bean.House;
import com.graduation.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;
//
//    @GetMapping("/charge")
//    public String toChargePage(HttpSession session,
//                               HttpServletRequest request){
////        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        String dateTime=df.format(new Date());
////        Integer month =
//        Calendar rightNow = Calendar.getInstance();
//        //获取当前月份
//        Integer mm = rightNow.get(Calendar.MONTH) + 1;
//
//        Integer u_id = (Integer)session.getAttribute("id");
//        List<House> houses = houseService.getHouses(u_id,mm);
//        request.setAttribute("houses",houses);
//        return "func/charge";
//    }

    //向数据库写数据
    @GetMapping("/add")
    public String c(){
        int num = 0;
        for (int i = 1;i <= 8;i++){
            for(int j = 1;j <= 20;j++){
                for(int k = 1;k <= 2;k++){
                    num++;
                    if (k == 1){

                        int area = 128;

                        houseService.createHouse(new House(i,j ,k,area,num));
                    }else{
                        int area = 108;
                        houseService.createHouse(new House(i,j,k,area,num));
                    }

                }
            }
        }

        return "index";
    }


}
