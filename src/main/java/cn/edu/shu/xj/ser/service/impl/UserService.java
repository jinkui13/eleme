package cn.edu.shu.xj.ser.service.impl;

import cn.edu.shu.xj.ser.entity.MyuserEntity;
import cn.edu.shu.xj.ser.mapper.UserMapper;
import cn.edu.shu.xj.ser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public MyuserEntity userLogin(String user_id, String user_pwd){
        return userMapper.userLogin(user_id,user_pwd);
    }

    @Override
    public void registerUser(String userName, String userSex, String pwd, String phoneNum, String userEmail) {
        userMapper.registerUser(userName, userSex, pwd, phoneNum, userEmail);
    }

    @Override
    public void resetpwd(String user_id,String newpwd,String phoneNum){
        userMapper.resetpwd(user_id,newpwd,phoneNum);
    }
}
