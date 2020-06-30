package com.graduation.controller;

import com.graduation.bean.Job;
import com.graduation.bean.User;
import com.graduation.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/job")
    public String job(HttpServletRequest request){

        List<Job> allJobs = jobService.getAllJobs();
        request.setAttribute("jobs",allJobs);
        return "job";

    }

    @PostMapping("/toEmploy")
    public String toEmploy(String jId, HttpSession session){
        User user = (User) session.getAttribute("loginuser");
        Integer jid = Integer.parseInt(jId);
        jobService.addEmployer(jid,user.getId());
        return "redirect:/job";

    }
}
