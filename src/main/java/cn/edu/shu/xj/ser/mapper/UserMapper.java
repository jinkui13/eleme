package cn.edu.shu.xj.ser.mapper;

import cn.edu.shu.xj.ser.entity.MyuserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {


    @Select("select user_id,user_name,user_phone,user_email,user_rigister_time,user_VIP_time from myuser where user_id =#{user_id} and user_pwd=#{user_pwd}")
    MyuserEntity userLogin(@Param("user_id") String user_id,@Param("user_pwd") String user_pwd);


    @Select("insert into myuser(user_name, user_sex, user_pwd, user_phone, user_email) values(#{userName},#{userSex},#{userSex},#{phoneNum},#{userEmail})")
    void registerUser(@Param("userName") String userName,@Param("userSex") String userSex,@Param("pwd") String pwd,@Param("phoneNum") String phoneNum,@Param("userEmail") String userEmail);

    @Select("UPDATE myuser SET user_pwd=#{newpwd} WHERE user_id =#{user_id} and user_phone = #{phoneNum}")
    void resetpwd(@Param("user_id") String user_id,@Param("newpwd") String newpwd,@Param("phoneNum") String phoneNum);
}
