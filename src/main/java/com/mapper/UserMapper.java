package com.mapper;


import com.domain.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}