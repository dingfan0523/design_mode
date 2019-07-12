package com.proxy.me.dynamic;

public class Test {
    public static void main(String[] args) {
        IUser user = new User();
        Proxy proxy = new Proxy(user);
        proxy.run();
        System.out.println("=========动态代理==========");
        /*User user1=new User();
        IUser iUser = (IUser) java.lang.reflect.Proxy.newProxyInstance(user1.getClass().getClassLoader(),
                user1.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("先做热身运动");
                        Object returnValue = method.invoke(user1, args);
                        System.out.println("喝水后去休息");
                        return returnValue;
                    }
                });
        iUser.run();*/
        MyProxyHandler myProxyHandler = new MyProxyHandler();
        user = (IUser) myProxyHandler.getInstance(user);
        user.run();
    }
}
