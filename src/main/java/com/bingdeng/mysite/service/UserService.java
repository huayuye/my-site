package com.bingdeng.mysite.service;

import com.bingdeng.mysite.entity.User;
import com.bingdeng.mysite.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User queryUserById(Integer id){
        return userMapper.queryUserById(id);
    }

}
