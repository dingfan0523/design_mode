package com.singleton;

/**
 * 静态内部类单例模式
 */
public class Singleton3 {

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return Singleton4.singleton;
    }

    /**
     * 静态内部类
     */
    static class Singleton4 {
        private static final Singleton3 singleton = new Singleton3();
    }
}
