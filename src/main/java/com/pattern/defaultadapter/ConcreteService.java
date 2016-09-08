package com.pattern.defaultadapter;

public class ConcreteService extends ServiceAdapter {

    @Override
    public void service1() {
        System.out.println("service1");
    }
}
