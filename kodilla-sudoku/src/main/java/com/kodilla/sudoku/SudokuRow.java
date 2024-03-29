package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow() {
        for( int i = 0; i < 9; i++) {
            sudokuRow.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }
    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    public void setSudokuRow(List<SudokuElement> sudokuRow) {
        this.sudokuRow = sudokuRow;
    }
}
