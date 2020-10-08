package com.demo.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// 标注切面
@Aspect
public class AnnotationPointCut {

    @Pointcut("execution(* com.demo.service.UserServiceImpl.*(..))")
    public void logUserService(){}

    @Before("logUserService()")
    public void beforeMethod() {
        System.out.println("before execution with annotation");
    }

    @After("logUserService()")
    public void afterMethod() {
        System.out.println("after execution with annotation");
    }

    // 可以给定一个参数，代表我们要获取处理切入的点
    @Around("logUserService()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before around");

        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("signature: " + jp.getSignature());
        System.out.println("after around");
        System.out.println("proceed: " + proceed);
    }
}
