package com.factory.devise2;

import com.factory.devise.CPUApi;
import com.factory.devise.GAMainBoard;
import com.factory.devise.IntelCpu;
import com.factory.devise.MainBoardApi;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public CPUApi createCpu() {
        return new IntelCpu(1111);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new GAMainBoard(1111);
    }
}
