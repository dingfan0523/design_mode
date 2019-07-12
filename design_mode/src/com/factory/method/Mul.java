package com.factory.method;

public class Mul implements Operation {
    /**
     * 乘法运算
     *
     * @param numberA
     * @param numberB
     * @return
     */
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
