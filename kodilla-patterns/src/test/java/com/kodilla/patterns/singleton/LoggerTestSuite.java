package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("\nThis is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.\n");
    }

    @Test
    void testGetFileName() {
        //Given
        logger = logger.INSTANCE;
        logger.log("First log");
        logger.log("Last log");
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("Last log", result);
    }
}
