package com.singleton;

/**
 * 饿汉单例模式
 * 直接实例化，没有使用的时候会存在不必要的开销
 */
public class Singleton2 {
    private static final Singleton2 singleton = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}
