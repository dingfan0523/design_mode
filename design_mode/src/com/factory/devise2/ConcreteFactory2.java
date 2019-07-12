package com.factory.devise2;

import com.factory.devise.AMDCpu;
import com.factory.devise.CPUApi;
import com.factory.devise.MSIMainBoard;
import com.factory.devise.MainBoardApi;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public CPUApi createCpu() {
        return new AMDCpu(334);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new MSIMainBoard(334);
    }
}
