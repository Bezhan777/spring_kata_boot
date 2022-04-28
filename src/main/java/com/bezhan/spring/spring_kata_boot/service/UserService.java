package com.bezhan.spring.spring_kata_boot.service;

import com.bezhan.spring.spring_kata_boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User>findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
