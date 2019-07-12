package com.factory.devise2;

import com.factory.devise.CPUApi;
import com.factory.devise.MainBoardApi;

public class ComputerEngineer {
    public static CPUApi cpu = null;
    public static MainBoardApi mainBoard = null;

    public static void makeComputer(AbstractFactory factory) {
        prepareHardWares(factory);
    }

    private static void prepareHardWares(AbstractFactory factory) {
        cpu = factory.createCpu();
        mainBoard = factory.createMainBoard();
        cpu.calculate();
        mainBoard.installCpu();
    }
}
