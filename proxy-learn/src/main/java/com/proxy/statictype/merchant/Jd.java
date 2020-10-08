package com.proxy.statictype.merchant;

import com.proxy.statictype.Sell;

/**
 * 京东实现sell功能
 */
public class Jd implements Sell {
    private Sell manufacturer;

    public Jd(Sell manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float sell(int amount) {
        float price = manufacturer.sell(amount);
        System.out.println("fast delivery");
        return price + 50;
    }
}
