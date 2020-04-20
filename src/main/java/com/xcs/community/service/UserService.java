package com.xcs.community.service;

import com.xcs.community.dao.UserMapper;
import com.xcs.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xcs
 * @create 2020-04-19 16:34
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
