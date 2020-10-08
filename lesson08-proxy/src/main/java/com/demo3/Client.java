package com.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host=new Host();
        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 通过调用处理角色来处理调用的接口对象
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
