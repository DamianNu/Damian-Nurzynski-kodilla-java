package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoard.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    @Override
    public String toString() {
        String a = " ";
        System.out.print("  ");
        for (int i = 0; i < 9; i++) {
            System.out.print("\n" + " ");
            for (int j = 0; j < 9; j++) {
                System.out.print("| " + sudokuBoard.get(i).getSudokuRow().get(j) + " ");
                if(j==2 || j == 5 ){
                    System.out.print("|\u001B[33m*\u001B[0m");
                }
            }
            System.out.print("|");
            if(i==2 || i == 5 ){
                System.out.print("\n\u001B[33m* * * * * * * * * * * * * * * * * * * * * *\u001B[0m");
            }
        }
        return a;
    }
}

