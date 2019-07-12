package com.factory.method;

public class Sub implements Operation {
    /**
     * 减法运算
     *
     * @param numberA
     * @param numberB
     * @return
     */
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
