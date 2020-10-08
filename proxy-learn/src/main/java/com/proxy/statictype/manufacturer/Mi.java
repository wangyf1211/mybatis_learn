package com.proxy.statictype.manufacturer;

import com.proxy.statictype.Sell;

/**
 * 小米
 */
public class Mi implements Sell {
    public float sell(int amount) {
        return 1399.0f;
    }
}
