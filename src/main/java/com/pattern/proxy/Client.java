package com.pattern.proxy;

//客户端调用
public class Client {

    public static void main(String[] args) {
        Subject sub = new ProxySubject();
        sub.request();
    }
}
