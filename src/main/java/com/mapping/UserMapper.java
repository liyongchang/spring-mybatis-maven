package com.mapping;

import com.domain.User;

public interface UserMapper {


    int insertUser(User record);


    User queryUserById(Integer uid);

    User selectPersonFetchOrder(Integer uid);


}