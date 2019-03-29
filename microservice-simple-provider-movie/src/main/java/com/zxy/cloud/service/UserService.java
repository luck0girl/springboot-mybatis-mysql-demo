package com.zxy.cloud.service;

import com.zxy.cloud.dao.UserMapper;
import com.zxy.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/3/28
 * Time: 17:34
 * Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return this.userMapper.getAllUsers();
    }
}
