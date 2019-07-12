package com.factory.devise;

public class AMDCpu implements CPUApi {
    private int pins = 0;

    public AMDCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU 频率:" + pins);
    }
}
