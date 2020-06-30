package com.graduation.mapper;

import com.graduation.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Select("select * from user where username=#{username}")
    public User getUserByName(String username);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(username,password,tel,url) values(#{username},#{password},#{tel},#{url})")
    public int addUser(User user);

    @Update("update user set nickname = #{nickname},tel=#{tel} where id = #{id} ")
    void updateInfo(String nickname,String tel,Integer id);

    @Update("update user set url = #{url} where id = #{id} ")
    void updateUser_ph(String url,Integer id);

    @Update("update user set password = #{password} where id = #{id} ")
    void updatePassword(String password,Integer id);
}
