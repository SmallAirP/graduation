package com.graduation.service;

import com.graduation.bean.Job;
import com.graduation.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobMapper jobMapper;

    public List<Job> getAllJobs(){
        List<Job> allJobs = jobMapper.getAllJobs();
        return allJobs;
    }

    public void addEmployer(Integer jid,Integer uid){
        Integer has = jobMapper.has(uid, jid);
        if (has.equals(null)){
            jobMapper.insertEmployer(jid,uid,0);
        }

    }

}
