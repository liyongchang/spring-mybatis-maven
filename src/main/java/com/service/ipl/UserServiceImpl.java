package com.service.ipl;

import com.domain.User;
import com.domain.UserCustom;
import com.domain.UserQueryVo;
import com.mapping.UserMapper;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sw on 2016/11/28.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;


    public int insertUser(User user) {
        return this.userMapper.insertUser(user);
    }

    public User queryUserByID(int id) {
        return this.userMapper.queryUserById(id);
    }

    public User selectPersonFetchOrder(int id) {
        return this.userMapper.selectPersonFetchOrder(id);
    }

    public User findByUsername(String username) {
        return null;
    }

    public void save(User user) {

    }

    public User findByCode(String code) {
        return null;
    }

    public void update(User existUser) {

    }

    public User login(User user) {
        return null;
    }

    public User findByUid(Integer uid) {
        return null;
    }

    public void delete(User existUser) {

    }

    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
        return this.userMapper.findUserList(userQueryVo);
    }


}
