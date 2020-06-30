package com.graduation.service;

import com.graduation.bean.User;
import com.graduation.mapper.UserMapper;
import com.graduation.tool.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class PersonService {

    @Autowired
    UserMapper userMapper;

    public void changeInfo(String nickname, String tel, Integer id){
        userMapper.updateInfo(nickname,tel,id);


    }

    public void changeUser_ph(String url,Integer id){
        userMapper.updateUser_ph(url,id);
    }


    public void changePassword(String password, Integer id) {
        userMapper.updatePassword(CryptoUtil.encode(password),id);
    }
}
