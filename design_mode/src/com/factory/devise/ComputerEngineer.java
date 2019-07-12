package com.factory.devise;

public class ComputerEngineer {
    private CPUApi cpuApi = null;
    private MainBoardApi mainBoardApi = null;

    /**
     * 装机过程
     *
     * @param cpuType
     * @param mainBoardType
     */
    public void makeComputer(int cpuType, int mainBoardType) {
        prepareHardWares(cpuType, mainBoardType);
    }

    /**
     * 初始化硬件
     *
     * @param cpuType
     * @param mainBoardType
     */
    private void prepareHardWares(int cpuType, int mainBoardType) {
        this.cpuApi = CPUFactory.createCpu(cpuType);
        this.mainBoardApi = MainBoardFactory.createMainBoard(mainBoardType);
        cpuApi.calculate();
        mainBoardApi.installCpu();
    }
}
