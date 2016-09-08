package com.pattern.observer;

public class ConcreteObserver implements Observer {

    public void update() {
        System.out.println("收到通知");
    }
}