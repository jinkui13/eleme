package cn.edu.shu.xj.ser.service;


import cn.edu.shu.xj.ser.entity.MyuserEntity;

public interface IUserService {
    /*注册用户*/
    void registerUser(String userName, String userSex, String pwd, String phoneNum, String userEmail);
    /*用户登录*/
    MyuserEntity userLogin(String user_id, String user_pwd);

    void resetpwd(String user_id, String newpwd, String phoneNum);
}
