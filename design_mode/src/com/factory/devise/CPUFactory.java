package com.factory.devise;

public class CPUFactory {
    public static CPUApi createCpu(int type) {
        CPUApi cpu = null;
        if (type == 1) {
            cpu = new IntelCpu(111);
        } else if (type == 2) {
            cpu = new IntelCpu(222);
        }
        return cpu;
    }
}
