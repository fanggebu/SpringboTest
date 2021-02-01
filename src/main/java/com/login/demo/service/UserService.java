package com.login.demo.service;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.service
 * @ClassName: UserService
 * @Author: qiuhen
 * @Description: 用户业务逻辑操作
 * @Date: 2021/1/31 14:49
 * @Version: 1.0
 */

import com.login.demo.dao.UserRepository;
import com.login.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findByUsername(User user) {

        return userRepository.findByUsername(user.getUsername());
    }

    public User findUserById(String userId) {
        return userRepository.findById(userId);
    }
}
