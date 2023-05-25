package com.kodilla.exception.test;

public class Exponentiation {
    public static void main(String[] args) {
        exponentiationAB(0, 1);
        exponentiationAB(3, 0);
        exponentiationAB(4, 1);
    }

    public static int exponentiationAB(int a, int b) {
        int result = a;
        if (a != 0 && b != 0) {
            for (int i = 1; i < b; i++) {
                result = result * a;
            }
            return result;
        } else if (b == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}