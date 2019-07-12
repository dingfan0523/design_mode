package com.factory.devise;

public class GAMainBoard implements MainBoardApi {
    private int cpuHoles = 0;

    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("GA MainBoard 插孔数:" + cpuHoles);
    }
}
