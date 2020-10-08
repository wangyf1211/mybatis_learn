package com.demo.mybatis.sqlSession;

import com.demo.mybatis.config.Configuration;
import com.demo.mybatis.sqlSession.defaults.DefaultSqlSessionFactory;
import com.demo.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用于创建SqlSessionFactoryBuilder对象
 * @author wyf
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流 构建一个SqlSessionFactory
     * @param inputStream
     * @return
     */
    public SqlSessionFactory build(InputStream inputStream){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(inputStream);
        return new DefaultSqlSessionFactory(cfg);
    }
}
