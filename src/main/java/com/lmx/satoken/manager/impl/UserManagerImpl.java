package com.lmx.satoken.manager.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmx.satoken.manager.UserManager;
import com.lmx.satoken.repository.UserMapper;
import com.lmx.satoken.repository.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName:UserManagerImpl
 * Package:com.lmx.satoken.manager.impl
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:35
 * @Version 1.0
 */
@Component
public class UserManagerImpl extends ServiceImpl<UserMapper, User> implements UserManager  {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getByUsername(String username) {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(User::getUsername,username);
       return getOne(userLambdaQueryWrapper);
    }
}
