package com.demo.mybatis.sqlSession;

/**
 * 自定义MyBatis和数据库交互的核心类
 * @author wyf
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T> 定义范型
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
