package com.demo.dao;

import com.demo.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
