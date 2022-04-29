package com.bezhan.spring.spring_kata_boot.dao;

import com.bezhan.spring.spring_kata_boot.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(Long id);
    List<User> userList();
}
