package com.lmx.satoken.manager;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmx.satoken.repository.dao.User;

/**
 * ClassName:UserManager
 * Package:com.lmx.satoken.manager
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:30
 * @Version 1.0
 */
public interface UserManager extends IService<User>{
    /**
     * 通过用户名查询用户信息
     * @param username
     */
    User getByUsername(String username);
}
