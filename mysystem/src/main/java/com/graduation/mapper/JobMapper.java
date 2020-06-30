package com.graduation.mapper;

import com.graduation.bean.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JobMapper {

    @Select("select * from job order by jobId desc")
    List<Job> getAllJobs();

    @Select("select id from jau where uid = #{uid} and jid=#{jid}")
    Integer has(Integer uid,Integer jid);

    @Delete("delete from job where jobId = #{jobId}")
    void deleteJob(Integer jobId);

    @Insert("insert into jAu(jid,uid,isT) values(#{jid},#{uid},#{isT})")
    void insertEmployer(Integer jid,Integer uid,Integer isT);
}
