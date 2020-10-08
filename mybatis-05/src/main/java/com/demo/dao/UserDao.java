package com.demo.dao;

import com.demo.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    User findById(int userId);

    List<User> findByName(String name);

    int getCount();
}
