package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard sudokuBoard;
    private Controler controler;

    public SudokuGame() {
        sudokuBoard = new SudokuBoard();
        controler = new Controler();
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public void insertASymbol() {
        String date = controler.dataEntered();
        if (date.equals("SUDOKU")) {
            System.out.println("Rozwiązanie sudoku");
        } else {
            int x = date.charAt(0)-48;
            int y = date.charAt(1)-48;
            int value = date.charAt(2)-48;
            sudokuBoard.getSudokuBoard().get(x).getSudokuRow().set(y,new SudokuElement(value));
        }
    }

    public boolean sudokuResolve() {
        boolean isResolved = false;
        System.out.println("\n              S  U  D  O  K  U");
        System.out.println(sudokuBoard + "\n");
        insertASymbol();
        return false;
    }

}
