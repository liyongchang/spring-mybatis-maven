package com.service;

import com.domain.User;

/**
 * Created by sw on 2016/11/28.
 */
public interface IUserService {
    public int insertUser(User user);

    public User queryUserByID(int id);

    public User findByUsername(String username);

    public void save(User user);

    public User findByCode(String code);

    public void update(User existUser);

    public User login(User user);

    public User findByUid(Integer uid);

    public void delete(User existUser);






}
