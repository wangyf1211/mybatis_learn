package com.demo.mybatis.sqlSession;

public interface SqlSessionFactory {
//    用于打开一个新的session对象
    SqlSession openSession();
}
