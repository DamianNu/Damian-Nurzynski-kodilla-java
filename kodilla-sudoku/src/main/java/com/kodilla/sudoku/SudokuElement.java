package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;
    private List<Integer> availableNumbers = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;
        for (int i = 1; i < 10; i++) {
            availableNumbers.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getAvailableNumbers() {
        return availableNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SudokuElement that)) return false;
        return getValue() == that.getValue() && Objects.equals(getAvailableNumbers(), that.getAvailableNumbers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getAvailableNumbers());
    }

    @Override
    public String toString() {
        if (value == EMPTY) {
            return " ";
        } else {
            return "" + value;
        }
    }
}
