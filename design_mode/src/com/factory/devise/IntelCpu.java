package com.factory.devise;

public class IntelCpu implements CPUApi {
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU 频率:" + pins);
    }
}
