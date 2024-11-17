package com.lmx.satoken.repository.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:User
 * Package:com.lmx.satoken.controller.dao
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:20
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
