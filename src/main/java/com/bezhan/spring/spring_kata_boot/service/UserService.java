package com.bezhan.spring.spring_kata_boot.service;

import com.bezhan.spring.spring_kata_boot.entity.User;

import java.util.List;

public interface UserService {
    List<User> userList();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(Long id);
}
