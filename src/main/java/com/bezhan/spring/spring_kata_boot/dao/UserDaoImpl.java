package com.bezhan.spring.spring_kata_boot.dao;

import com.bezhan.spring.spring_kata_boot.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public void delete(User user) {

        em.remove(em.contains(user) ? user : em.merge(user));
    }

    @Override
    public void edit(User user) {
        User newUser =  em.merge(user);
        user.setId(newUser.getId());
    }

    @Override
    public User getById(Long id) {
        User user = em.find(User.class,id);
        return user;
    }

    @Override
    public List<User> userList() {
        Query query = em.createQuery("from User");
        List<User> allUsers = query.getResultList();
        return allUsers ;
    }
}
