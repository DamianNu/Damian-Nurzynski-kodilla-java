package com.kodilla.sudoku;

public class Application {

    public static void main(String[] args) {
        SudokuGame game = new SudokuGame();
        boolean isResolved = false;
        while (!isResolved) {
            isResolved = game.sudokuResolve();
        }
    }

}
