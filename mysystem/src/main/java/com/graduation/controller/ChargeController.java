package com.graduation.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.graduation.bean.Bill;
import com.graduation.bean.House;
import com.graduation.bean.User;
import com.graduation.config.AlipayConfig;
import com.graduation.mapper.HousrMapper;
import com.graduation.mapper.PriceMapper;
import com.graduation.service.ChargeService;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Map;

@Controller
public class ChargeController {
    private static AlipayConfig alipayConfig = new AlipayConfig();
    @Autowired
    ChargeService chargeService;
    @Autowired
    HousrMapper housrMapper;
    @Autowired
    PriceMapper priceMapper;
    @GetMapping("/charge")
    public String charge(HttpSession session, String month, HttpServletRequest request){
        User user = (User) session.getAttribute("loginuser");
        House house = chargeService.queryHouse(user.getId());
        Float price = priceMapper.getPriceByMonth(Integer.parseInt(month));
        Calendar calendar = Calendar.getInstance();
        int nowMonth = calendar.get(Calendar.MONTH)+1;
        request.setAttribute("nowMonth",nowMonth);
        request.setAttribute("house",house);
        request.setAttribute("month",month);
        request.setAttribute("price",price);
        if(month.equals("0")){
            return "func/charge";
        }else {
            Bill bill = chargeService.queryBill(month, house.getId());
            if(bill == null){//表示没有缴费
                request.setAttribute("isG","0");
            }else{
                request.setAttribute("isG","1");
            }
        }


        return "func/charge";
    }

    //调用支付宝支付接口
    @RequestMapping("/pay")
    @ResponseBody
    public String pay(String hid,String charge,String month) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.URL,alipayConfig.APPID,
                alipayConfig.RSA_PRIVATE_KEY,alipayConfig.FORMAT,alipayConfig.CHARSET,alipayConfig.ALIPAY_PUBLIC_KEY,
                alipayConfig.SIGNTYPE);

        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();

        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();

        String out_trade_no = new Tool().getNowTime()+hid+month;

        String subject = "物管费";
        String total_amount = charge;
        String body = "物管费";
        String timeout_express = "25";
        String product_code = new Tool().getNowTime()+"0";
        model.setOutTradeNo(out_trade_no);
        model.setSubject(subject);
        model.setTotalAmount(total_amount);
        model.setBody(body);
        model.setTimeoutExpress(timeout_express);
        model.setProductCode(product_code);
        request.setBizModel(model);
        //设置异步回调地址
        request.setNotifyUrl(alipayConfig.notify_url);
        //设置同步回调地址
        request.setReturnUrl(alipayConfig.return_url);

        String form = alipayClient.pageExecute(request).getBody();

        return form;
    }

    //支付宝异步回调方法
    @PostMapping("/notifyN")
    @ResponseBody

    public String notifyN(){
        System.out.println("异步回调方法");

        return "success";
    }

    //支付宝异步同步方法
    @GetMapping("/returnN")
    public String returnN(@RequestParam Map<String, String> params){
        String info = params.get("out_trade_no");
        String charge = params.get("total_amount");
        String hid = info.substring(info.length()-2,info.length()-1);
        String month = info.substring(info.length()-1);
        chargeService.pay(hid,charge,month);

        return "redirect:/charge?month=0";
    }
}
