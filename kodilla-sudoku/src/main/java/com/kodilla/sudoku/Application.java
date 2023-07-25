package com.kodilla.sudoku;

public class Application {

    public static void main(String[] args) {
        SudokuGame game = new SudokuGame();
        boolean isResolved = false;
        while (!isResolved) {
            isResolved = game.sudokuResolve();
        }
//        SudokuBoard sudokuBoard = new SudokuBoard();
//        sudokuBoard.getSudokuBoard().get(0).getSudokuRow().add(0,new SudokuElement(1));
//        System.out.println(sudokuBoard);



    }

}
