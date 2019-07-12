package com.proxy.me.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyHandler implements InvocationHandler {
    public Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class clazz = target.getClass();
        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("执行之前");
        Object returnValue = method.invoke(target, args);
        System.out.println("执行之后");
        return returnValue;
    }
}
