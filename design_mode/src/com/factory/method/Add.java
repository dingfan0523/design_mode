package com.factory.method;

public class Add implements Operation {
    /**
     * 加法运算
     *
     * @param numberA
     * @param numberB
     * @return
     */
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
