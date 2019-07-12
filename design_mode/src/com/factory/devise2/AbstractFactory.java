package com.factory.devise2;

import com.factory.devise.CPUApi;
import com.factory.devise.MainBoardApi;

public interface AbstractFactory {
    /**
     * 创建cpu
     *
     * @return
     */
    public CPUApi createCpu();

    /**
     * 创建主板
     *
     * @return
     */
    public MainBoardApi createMainBoard();
}
