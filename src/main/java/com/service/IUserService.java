package com.service;

import com.domain.User;
import com.domain.UserCustom;
import com.domain.UserQueryVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sw on 2016/11/28.
 */
@Component("userMapper")
public interface IUserService {
    public int insertUser(User user);

    public User queryUserByID(int id);

    public User findByUsername(String username);

    public User selectPersonFetchOrder(int id);

    public void save(User user);

    public User findByCode(String code);

    public void update(User existUser);

    public User login(User user);

    public User findByUid(Integer uid);

    public void delete(User existUser);

    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;


}
