package com.mathscs.spring.boot.demo.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathscs.spring.boot.demo.mysql.mapper.UserMapper;
import com.mathscs.spring.boot.demo.mysql.model.User;

/**
 * TODO: description
 * Date: 2018-03-28
 *
 * @author caizhenhua
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryFirst")
    public User queryFirst() {
        return userMapper.queryFirst();
    }
}
