package com.proxy.quiet;

public class DynamicProxy {
    public Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }
}
