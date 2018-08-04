package com.bingdeng.mysite.mapper;

import com.bingdeng.mysite.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUserById(Integer id);
}
