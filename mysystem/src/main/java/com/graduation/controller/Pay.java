package com.graduation.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.graduation.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Pay {

//    @RequestMapping("/pay")
//    @ResponseBody
//    public String pay(String out_trade_no,String subject,String total_amount,
//                      String body,String timeout_express,String product_code) throws AlipayApiException {
//
//        AlipayConfig alipayConfig = new AlipayConfig();
//        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.URL,alipayConfig.APPID,
//                alipayConfig.RSA_PRIVATE_KEY,alipayConfig.FORMAT,alipayConfig.CHARSET,alipayConfig.ALIPAY_PUBLIC_KEY,
//                alipayConfig.SIGNTYPE);
//
//
//        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
//
//        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
//        model.setOutTradeNo(out_trade_no);
//        model.setSubject(subject);
//        model.setTotalAmount(total_amount);
//        model.setBody(body);
//        model.setTimeoutExpress(timeout_express);
//        model.setProductCode(product_code);
//
//        request.setBizModel(model);
//        //设置异步回调地址
//        request.setNotifyUrl(alipayConfig.notify_url);
//        //设置同步回调地址
//        request.setReturnUrl(alipayConfig.return_url);
//
//        String form = alipayClient.pageExecute(request).getBody();
//
//        return form;
//    }
//    @PostMapping("/notifyN")
//    @ResponseBody
//
//    public String notifyN(){
//        System.out.println("异步回调方法");
//
//        return "success";
//    }
//
//
//    @GetMapping("/returnN")
//    public String returnN(){
//        System.out.println("成功");
//        return "redirect:/index.html";
//    }

}
