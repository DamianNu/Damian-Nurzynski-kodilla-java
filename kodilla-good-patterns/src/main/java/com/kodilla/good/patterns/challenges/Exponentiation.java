package com.kodilla.good.patterns.challenges;

public class Exponentiation {
    public static void main(String[] args) {
        Exponentiation exponentiation = new Exponentiation();
        System.out.println(exponentiation.exponentiationX(6));

    }
    public long exponentiationX(int x){
        long result = 1;
        for(int i = 1;i<x+1;i++){
            result = result * i;
        }
        return result;
    }
}
