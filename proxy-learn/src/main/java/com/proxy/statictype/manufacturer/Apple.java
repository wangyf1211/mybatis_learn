package com.proxy.statictype.manufacturer;

import com.proxy.statictype.Sell;

/**
 * 苹果
 */
public class Apple implements Sell {

    public float sell(int amount) {
        System.out.println("apple sell ");
        return 2199.0f;
    }
}
