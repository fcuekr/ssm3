package com.fucker.service.impl;

import com.fucker.dao.UserDao;
import com.fucker.pojo.User;
import com.fucker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }
}
