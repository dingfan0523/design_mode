package com.factory.devise2;

public class Test {
    public static void main(String[] args) {
        System.out.println("====生产第一个====");
        ComputerEngineer.makeComputer(new ConcreteFactory());
        System.out.println("====生产第二个====");
        ComputerEngineer.makeComputer(new ConcreteFactory2());
    }
}
