package com.zxy.cloud.controller;

import com.zxy.cloud.entity.User;
import com.zxy.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with zhangxy
 * User: lucky
 * Date: 2019/3/28
 * Time: 17:18
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

}
