package seminar1.seminarDj.task1.gb.task05;

import seminar1.seminarDj.task1.gb.task5.GameBoard;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] initialState = {2, 1, 0, 2, 0, 2, 0, 1, 3};
        seminar1.seminarDj.task1.gb.task5.GameBoard gameBoard = new GameBoard(initialState);

        try {
            gameBoard.writeToFile("gameBoard.bin");
            gameBoard.readFromFile("gameBoard.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        gameBoard.printBoard();
    }
}
