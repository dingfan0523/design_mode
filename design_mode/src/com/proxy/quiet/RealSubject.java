package com.proxy.quiet;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }

    @Override
    public void hidden(){
        System.out.println("隐藏");
    }
}
