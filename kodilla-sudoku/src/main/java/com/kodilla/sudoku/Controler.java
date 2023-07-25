package com.kodilla.sudoku;

import java.util.Scanner;

public class Controler {
    private Scanner scanner = new Scanner(System.in);

    public String dataEntered(){
        System.out.println("Enter data into the sudoku: column, row, value. Or type: \"SUDOKU\" to solve sudoku.");
        return scanner.next();
    }


}
