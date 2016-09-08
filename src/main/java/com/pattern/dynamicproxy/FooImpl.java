package com.pattern.dynamicproxy;

public class FooImpl implements Foo {

    public FooImpl() {
    }

    public void doAction() {
        System.out.println("in FooImpl.doAction()");
    }
}
