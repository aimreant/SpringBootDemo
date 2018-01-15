package com.jianyujianyu.service;

import com.jianyujianyu.dao.UserRepository;
import com.jianyujianyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lujianyu on 2018/1/15.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name) {
        User user = null;
        try {
            user = userRepository.findByUsername(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
