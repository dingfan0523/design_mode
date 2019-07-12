package com.factory.simple;

/**
 * 水果工厂
 */
public class FruitFactory {
    /**
     * 得到水果
     *
     * @param type
     * @return
     */
    public static Fruit createFruit(String type) {
        if (type.equals("apple")) {
            return new Apple();
        } else if (type.equals("pear")) {
            return new Pear();
        }
        return null;
    }
}
