package com.demo4;

import com.demo2.UserService;
import com.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.delete();
    }
}
