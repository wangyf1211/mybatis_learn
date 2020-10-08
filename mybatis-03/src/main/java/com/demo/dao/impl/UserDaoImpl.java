package com.demo.dao.impl;

import com.demo.dao.UserDao;
import com.demo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;

    }
    public List<User> findAll() {
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.demo.dao.UserDao.findAll");
        session.close();
        return users;
    }
}
