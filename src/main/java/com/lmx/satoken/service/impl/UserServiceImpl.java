package com.lmx.satoken.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.lmx.satoken.controller.request.UserLoginRequest;
import com.lmx.satoken.dto.Result;
import com.lmx.satoken.manager.UserManager;
import com.lmx.satoken.repository.UserMapper;
import com.lmx.satoken.repository.dao.User;
import com.lmx.satoken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * ClassName:UserServiceImpl
 * Package:com.lmx.satoken.service.impl
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:28
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserManager userManager;

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录接口
     * @param userLoginRequest
     */
    @Override
    public Result login(UserLoginRequest userLoginRequest) {
        if (Objects.isNull(userLoginRequest.getUsername()))
        {
            return Result.fail("用户名为空");
        }
        User userinfo = userManager.getByUsername(userLoginRequest.getUsername());
        if (Objects.isNull(userinfo))
        {
            return Result.fail("用户不存在");
        }
        //校验密码
        if (userinfo.getPassword().equals(userLoginRequest.getPassword()))
        {
            StpUtil.login(userinfo.getId());
            return Result.ok("登陆成功");
        }
        return Result.fail("登录失败");
    }

    /**
     * 用户登出接口
     * @return
     */
    @Override
    public Result logout() {
        StpUtil.logout();
        return Result.ok("登出");
    }
}
