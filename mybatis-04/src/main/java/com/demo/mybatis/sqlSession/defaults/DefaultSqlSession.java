package com.demo.mybatis.sqlSession.defaults;

import com.demo.mybatis.config.Configuration;
import com.demo.mybatis.sqlSession.SqlSession;
import com.demo.mybatis.sqlSession.proxy.MapperProxy;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

import static com.demo.mybatis.utils.DataSourceUtil.getConnection;

public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;

    private Connection connection;

    public DefaultSqlSession(Configuration cfg){
        this.cfg = cfg;
        this.connection = getConnection(cfg);
    }
    /**
     * 创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
//    public <T> T getMapper(Class<T> daoInterfaceClass) {
//        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(), new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(), connection));
//    }
    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy(cfg.getMappers(),connection));
    }

    /**
     * 释放资源
     */
    public void close() {
        if(connection!=null){
            try{
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
