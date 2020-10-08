package com.demo.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method      方法
     * @param args        参数
     * @param target      目标
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("methodName: " + method.getName() + "returnValue is:" + returnValue);
    }
}
