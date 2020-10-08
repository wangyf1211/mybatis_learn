package com.proxy.statictype;

import com.proxy.statictype.manufacturer.Apple;
import com.proxy.statictype.merchant.Taobao;

public class Client {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Taobao taobao = new Taobao(apple);
        float price = taobao.sell(100);
        System.out.println("price: "+price);
    }
}
