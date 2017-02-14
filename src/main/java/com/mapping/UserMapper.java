package com.mapping;

import com.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insertUser(User record);

    int insertSelective(User record);

    User queryUserById(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}