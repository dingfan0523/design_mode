package com.proxy.me.dynamic;

public class Proxy implements IUser {
    public IUser user;

    public Proxy(IUser user1) {
        this.user = user1;
    }

    @Override
    public void run() {
        preRun();
        user.run();
        breRun();
    }

    public void preRun() {
        System.out.println("开始热身运动");
    }

    public void breRun() {
        System.out.println("喝水休息");
    }
}
