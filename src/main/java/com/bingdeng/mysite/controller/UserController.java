package com.bingdeng.mysite.controller;

import com.bingdeng.mysite.entity.User;
import com.bingdeng.mysite.service.UserService;
import com.bingdeng.mysite.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public User queryUserById(@PathVariable Integer id){
      return  userService.queryUserById(id);
    }

    @RequestMapping("/redis/{id}/{value}")
    public Object setSetToRedis(@PathVariable String id,@PathVariable String value){
        RedisUtil.set(id,value,10L);
        return  RedisUtil.get(id);
    }

    @RequestMapping("/redis/{id}")
    public Object removeFromRedis(@PathVariable String id){
        RedisUtil.remove(id);
        return  RedisUtil.get(id);
    }



}
