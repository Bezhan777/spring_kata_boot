package com.bezhan.spring.spring_kata_boot.repository;

import com.bezhan.spring.spring_kata_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
