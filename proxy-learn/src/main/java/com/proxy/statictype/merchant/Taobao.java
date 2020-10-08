package com.proxy.statictype.merchant;

import com.proxy.statictype.Sell;

/**
 * Taobao作为代理类，实现Sell功能
 */
public class Taobao implements Sell {
    private Sell manufacturer;

    public Taobao(Sell manufacturer){
        this.manufacturer = manufacturer;
    }

    public float sell(int amount) {
        float price = manufacturer.sell(amount);
        System.out.println("Taobao merchant increase 100 yuan");
        return price + 100;
    }
}
