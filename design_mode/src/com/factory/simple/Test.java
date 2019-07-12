package com.factory.simple;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.createFruit("apple");
        fruit.whatIm();
    }
}
