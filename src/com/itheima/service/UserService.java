package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.util.List;

/**
 * Created by batcave on 16/2/20.
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public List<User> findAllUser(){
        return userDao.findAll();
    }

    public User findUserById(String id){
        return userDao.findById(id);
    }

    public void regist(User user){
        userDao.save(user);
    }

    public User login(User user){
        return userDao.find(user.getUsername(),user.getPassword());
    }
}
