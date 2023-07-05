package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    @Test
    void testAddAToB() {
        //Given
        //do nothing
        //When
        double result = calculator.add(1.5,3.5);

        //Then
        assertEquals(result,5.0);
    }

    @Test
    void testSubtractAToB() {
        //Given
        //do nothing
        //When
        double result = calculator.sub(5.2,1.7);

        //Then
        assertEquals(result,3.5);
    }

    @Test
    void testMultiplicationOfAToB() {
        //Given
        //do nothing
        //When
        double result = calculator.mul(6.0,1.5);

        //Then
        assertEquals(result,9.0);
    }

    @Test
    void testDivisionAToB() {
        //Given
        //do nothing
        //When
        double result = calculator.div(12.0,2.0);

        //Then
        assertEquals(result,6.0);
    }

    @Test
    void testDivideABy0() {
        //Given
        //do nothing
        //When
        double result = calculator.div(12.0,0.0);

        //Then
        assertEquals(result,0.0);
    }
}
