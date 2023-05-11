package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: start of test");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end of test");
    }


    @DisplayName("Checks whether the class OddNumbersExterminator " +
            "behaves correctly when the list is empty.")
    @Test
        void testOddNumbersExterminatorEmptyList () {
            //Given
        List<Integer> numbers = new ArrayList<>();

            //When
        OddNumbersExterminator listTest = new OddNumbersExterminator();
        List<Integer> listOdd = listTest.exterminate(numbers);
        int listSize = listOdd.size();
            //Then
        Assertions.assertEquals(0,listSize);

        }


    @DisplayName("Checking whether the class OddNumbersExterminator behaves correctly " +
                 "when the list contains even and odd numbers")
    @Test
        void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(13);
        numbers.add(17);

        //When
        OddNumbersExterminator listTest = new OddNumbersExterminator();
        List<Integer> listOdd = listTest.exterminate(numbers);
        List<Integer> expectedListOdd = new ArrayList<>();
        expectedListOdd.add(2);
        expectedListOdd.add(0);

        //Then
        Assertions.assertEquals(expectedListOdd,listOdd);


    }


}
