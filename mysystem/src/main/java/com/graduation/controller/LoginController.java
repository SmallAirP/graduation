package com.graduation.controller;

import com.graduation.bean.User;
import com.graduation.mapper.UserMapper;
import com.graduation.tool.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserMapper mapper;

    @PostMapping(value = "/user/checklogin")
    public String login(@RequestParam("username") String name,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session){
        if(!StringUtils.isEmpty(name)){

            User user= mapper.getUserByName(name);
            String p = CryptoUtil.encode(password);
            //判断用户名、密码是否正确
            if (p.equals(user.getPassword())){
                //将用户信息存入session中
                session.setAttribute("loginuser",user);
                session.setAttribute("isT","y");
                session.setAttribute("id",user.getId());

                return "redirect:/index.html";
            }else{
                map.put("msg","用户名密码错误");
                return "login";
            }
        }else{
            map.put("msg","用户名密码错误");
            return "login";
        }

    }

}
