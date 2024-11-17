package com.lmx.satoken.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.lmx.satoken.controller.request.UserLoginRequest;
import com.lmx.satoken.dto.Result;
import com.lmx.satoken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/authority")
public class TestController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody UserLoginRequest userLoginRequest){
       return userService.login(userLoginRequest);
    }

    @GetMapping("/islogin")
    public Result isLogin(){
        return Result.ok( "当前会话是否登录：" + StpUtil.isLogin());
    }
    @GetMapping("/info")
    public Result info(){
        StpUtil.setLoginId(10001);          // 标记当前会话登录的账号id
        Object loginId = StpUtil.getLoginId();// 获取当前会话登录的账号id
        System.out.println("getLoginId:"+loginId);
        StpUtil.isLogin();                  // 获取当前会话是否已经登录, 返回true或false

       // StpUtil.logout();                   // 当前会话注销登录
        StpUtil.logoutByLoginId(10001);     // 让账号为10001的会话注销登录（踢人下线）
        StpUtil.hasRole("super-admin");     // 查询当前账号是否含有指定角色标识, 返回true或false
        StpUtil.hasPermission("user:add");  // 查询当前账号是否含有指定权限, 返回true或false
        StpUtil.getSession();               // 获取当前账号id的Session
        StpUtil.getSessionByLoginId(10001); // 获取账号id为10001的Session
        StpUtil.getTokenValueByLoginId(10001);  // 获取账号id为10001的token令牌值
        //StpUtil.setLoginId(10001, "PC");        // 指定设备标识登录
        //StpUtil.logoutByLoginId(10001, "PC");   // 指定设备标识进行强制注销 (不同端不受影响)
        return null;
    }
    @PostMapping("/logout")
    public Result login(){
        return userService.logout();
    }



}
