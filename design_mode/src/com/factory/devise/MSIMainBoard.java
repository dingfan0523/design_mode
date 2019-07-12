package com.factory.devise;

public class MSIMainBoard implements MainBoardApi {
    private int cpuHoles = 0;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("MSI MainBoard 插孔数:" + cpuHoles);
    }
}
