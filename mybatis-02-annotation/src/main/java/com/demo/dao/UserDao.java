package com.demo.dao;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
}
