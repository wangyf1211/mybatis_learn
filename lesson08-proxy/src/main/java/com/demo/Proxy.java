package com.demo;

public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        host.rent();
    }

    public void checkHouse() {
        System.out.println("check house for client");
    }

    public void sign() {
        System.out.println("sign");
    }
}
