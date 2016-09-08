package com.pattern.strategy;

public class DivideStrategy implements Strategy {

    public int calculate(int a, int b) {
        return a / b;
    }
}
