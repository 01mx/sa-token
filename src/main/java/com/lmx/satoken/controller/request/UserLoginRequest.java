package com.lmx.satoken.controller.request;

import lombok.Data;

/**
 * ClassName:UserLoginRequest
 * Package:com.lmx.satoken.controller.request
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:45
 * @Version 1.0
 */
@Data
public class UserLoginRequest {
    private String username;
    private String password;

}
