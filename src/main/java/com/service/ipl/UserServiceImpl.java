package com.service.ipl;

import com.mapper.UserMapper;
import com.domain.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sw on 2016/11/28.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name="userMapper")
    private UserMapper userMapper;


    public int insert(User user) {
        return this.userMapper.insert(user);
    }
}
