package com.singleton;

/**
 * 懒汉式单例模式
 * 主要是多线程的问题,可能会实例化多个
 * 所以要加好同步
 */
public class Singleton1 {
    private volatile static Singleton1 singleton1 = null;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
