package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");

        //When
        double resultAdd = calculator.add(1.5, 3.5);
        double resultSub = calculator.sub(7.5, 3.5);
        double resultMul = calculator.mul(1.2, 4.5);
        double resultDiv = calculator.div(9.9, 3.3);

        //Then
        assertEquals(resultAdd, 5.0, 0.00001);
        assertEquals(resultSub, 4.0, 0.00001);
        assertEquals(resultMul, 5.4, 0.00001);
        assertEquals(resultDiv, 3.0, 0.00001);

    }
}
