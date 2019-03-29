package com.zxy.cloud.dao;

import com.zxy.cloud.entity.User;

import java.util.List;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/3/28
 * Time: 17:33
 * Description:
 */
public interface UserMapper {
    List<User> getAllUsers();
}
