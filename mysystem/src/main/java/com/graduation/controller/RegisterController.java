package com.graduation.controller;

import com.graduation.bean.User;
import com.graduation.mapper.UserMapper;
import com.graduation.tool.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private UserMapper mapper;

    @PostMapping(value = "/user/register")
    public String addUser(@RequestParam("username") String name,
                          @RequestParam("password") String password,
                          @RequestParam("tel") String tel,
                          Map<String,Object> map,
                          HttpSession session) {

        if (!StringUtils.isEmpty(name) && !StringUtils.isEmpty(password) && !StringUtils.isEmpty(tel)) {

            User user = new User();
            user.setUsername(name);
            user.setPassword(CryptoUtil.encode(password));
            user.setTel(tel);
            user.setUrl("images/user_photo/user_photo.png");
            user.setNickname("新用户");
            int id = mapper.addUser(user);
            session.setAttribute("loginuser",user);
            session.setAttribute("isT","y");
            session.setAttribute("id",user.getId());
            return "index";
        } else {
            map.put("msg", "信息不完整");
            return "register";
        }
    }
}
