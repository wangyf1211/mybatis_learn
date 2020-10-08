package com.demo.mybatis.sqlSession.defaults;

import com.demo.mybatis.config.Configuration;
import com.demo.mybatis.sqlSession.SqlSession;
import com.demo.mybatis.sqlSession.SqlSessionFactory;

/**
 * SqlSessionFactory的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(this.cfg);
    }
}
