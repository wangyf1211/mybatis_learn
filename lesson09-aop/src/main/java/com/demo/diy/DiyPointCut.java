package com.demo.diy;

public class DiyPointCut {

    public void beforeMethod(){
        System.out.println("before execution");
    }

    public void afterMethod(){
        System.out.println("after execution");
    }
}
