package com.reflect.service.impl;

import com.reflect.service.HelloService;

public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        System.out.println("hello, " + name);
    }
}


