package com.mapping;

import com.domain.User;
import com.domain.UserCustom;
import com.domain.UserQueryVo;

import java.util.List;

public interface UserMapper {


    int insertUser(User record);


    User queryUserById(Integer uid);

    User selectPersonFetchOrder(Integer uid);

    List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;


}