package com.kodilla.exception.test;

public class Exponentiation {
    public static void main(String[] args) {
        exponentiationAB(0, 1);
        exponentiationAB(3, 0);
        exponentiationAB(4, 2);
    }

    public static int exponentiationAB(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            int result = a;
            if (a != 0 && b != 0) {
                for (int i = 1; i < b; i++) {
                    result = result * a;
                }
            }
            return result;
        }
    }
}