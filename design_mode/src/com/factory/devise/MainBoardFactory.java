package com.factory.devise;

public class MainBoardFactory {
    public static MainBoardApi createMainBoard(int type) {
        MainBoardApi mainBoard = null;
        if (type == 1) {
            mainBoard = new GAMainBoard(2);
        } else if (type == 2) {
            mainBoard = new MSIMainBoard(3);
        }
        return mainBoard;
    }
}
