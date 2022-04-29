package com.bezhan.spring.spring_kata_boot.service;

import com.bezhan.spring.spring_kata_boot.entity.User;
import com.bezhan.spring.spring_kata_boot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> userList() {
        return userDao.userList();
    }
}
