package com.demo.dao;

import com.demo.domain.User;
import com.demo.mybatis.annocation.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
}
