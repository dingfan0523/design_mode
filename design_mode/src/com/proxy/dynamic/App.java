package com.proxy.dynamic;


import com.proxy.quiet.RealSubject;
import com.proxy.quiet.Subject;

public class App {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject subject1 = (Subject) new ProxyFactory(subject).getProxyInstance();
        subject1.Request();
        subject1.hidden();
    }
}
