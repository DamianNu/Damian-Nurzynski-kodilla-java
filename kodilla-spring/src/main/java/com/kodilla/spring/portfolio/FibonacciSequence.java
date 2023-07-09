package com.kodilla.spring.portfolio;

public class FibonacciSequence {

    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.sequenceX(12));
    }

    public long sequenceX(int x) {
        if (x == 1) {
            return 1;
        } else {
            long result = 0;
            long a = 1;
            for (int i = 1; i < x + 1; i++) {
                result = result + a;
                a = result - a;
            }
            return result;
        }
    }
}

