package com.graduation.controller;

import com.graduation.bean.User;
import com.graduation.service.PersonService;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/changeInfo")
    public String changeInfo(HttpSession session, String name, String tel){
        User user = (User) session.getAttribute("loginuser");
        user.setNickname(name);
        user.setTel(tel);
        session.setAttribute("loginuser",user);
        personService.changeInfo(name,tel,user.getId());
        return "redirect:person.html";

    }

    @PostMapping("/changePassword")
    public String changePassword(String password,HttpSession session){
        User user = (User) session.getAttribute("loginuser");
        personService.changePassword(password,user.getId());
        session.removeAttribute("loginuser");
        return "redirect:login.html";

    }



    @PostMapping("/changePh")
    public String fileUpload(
            @RequestParam("file") MultipartFile file, HttpServletRequest req, Model model,HttpSession session){
        try {
            //给文件一个名字
            String fileName = System.currentTimeMillis()+file.getOriginalFilename();

            User user = (User) session.getAttribute("loginuser");
            user.setUrl(fileName);


            personService.changeUser_ph(fileName,user.getId());
            session.setAttribute("loginuser",user);
            String destFileName = "F:\\photo\\"+File.separator+fileName;
            File destFile = new File(destFileName);
            destFile.getParentFile().mkdirs();
            System.out.println(destFile);
            file.transferTo(destFile);
            model.addAttribute("fileName",fileName);
            model.addAttribute("path",destFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        }
        return "redirect:person_ph.html";
    }

}
