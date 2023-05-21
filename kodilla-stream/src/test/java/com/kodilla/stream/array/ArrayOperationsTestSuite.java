package com.kodilla.stream.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @DisplayName("Test: get Average")
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2,3,4,5,7,8,3,2,3,3,4,6,8,3,7,9,5,2,1,0};

        //When
        double result = getAverage(numbers);

        //Then
        assertEquals(4.25, result);
    }

}
