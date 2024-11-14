package com.lmx.satoken;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/login")
    public String login(String username,String password){
        //模拟登录校验
        if("xx".equals(username) && "123456".equals(password)){
            StpUtil.login(1001);
            return "登陆成功";
        }
        return "登陆失败";
    }

    @GetMapping("/islogin")
    public String test(){
        return "当前会话是否登录：" + StpUtil.isLogin();
    }
}
