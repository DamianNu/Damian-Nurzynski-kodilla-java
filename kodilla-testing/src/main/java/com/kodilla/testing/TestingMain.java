package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(50,50);
        int resultSubtract = calculator.subtract(101,25);

        if( resultAdd==100 && resultSubtract==76){
            System.out.println("Calculator - test OK");
        } else {
            System.out.println("Calculator - Error");
        }

    }
}
