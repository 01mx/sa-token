package com.lmx.satoken.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmx.satoken.repository.dao.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UserMapper
 * Package:com.lmx.satoken.repository.dao
 * Description
 *
 * @Author 李明星
 * @Create 2024/11/16 11:24
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{
}