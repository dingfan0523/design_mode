package com.factory.method;

public class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
