package cn.edu.shu.xj.ser.controller;


import cn.edu.shu.xj.ser.entity.MyuserEntity;
import cn.edu.shu.xj.ser.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "用户登录")
    @GetMapping("/api/user/login")
    public MyuserEntity userLogin(String user_id,String user_pwd){
        MyuserEntity user = userService.userLogin(user_id,user_pwd);
        return user;
    }

    @ApiOperation(value = "用户注册")
    @GetMapping("/signin")
    public void queryRegisteruser(String userName, String userSex, String pwd, String phoneNum, String userEmail){
        userService.registerUser(userName, userSex, pwd, phoneNum, userEmail);
    }

    @ApiOperation(value = "修改密码")
    @GetMapping("/resetpwd")
    public void resetpwd(String user_id,String newpwd,String phoneNum){
        userService.resetpwd(user_id,newpwd,phoneNum);
    }
}
