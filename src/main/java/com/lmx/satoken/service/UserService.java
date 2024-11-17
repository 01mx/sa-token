package com.lmx.satoken.service;

import com.lmx.satoken.controller.request.UserLoginRequest;
import com.lmx.satoken.dto.Result;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;

/**
 * ClassName:UserService
 * Package:com.lmx.satoken.service
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:28
 * @Version 1.0
 */

public interface UserService {
    Result login(UserLoginRequest userLoginRequest);

    Result logout();
}
