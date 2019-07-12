package com.factory.method;

public class DivFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("除法运算");
        return new Div();
    }
}
