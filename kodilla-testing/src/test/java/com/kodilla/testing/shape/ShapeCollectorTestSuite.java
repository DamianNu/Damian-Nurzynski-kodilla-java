package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@Nested
@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    class AddFigure{
        @Test
        void testAddFigure() {
            //Given
            Square square1 = new Square("Kwadrat", 12.11);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(square1);

            //Then
            Assertions.assertEquals(square1,shapeCollector.shapes.get(0));
        }
    }

    @Nested
    class RemoveFigure {
        @Test
        void testRemoveFigure() {
            //Given
            Square square1 = new Square("Kwadrat", 12.11);
            Square square2 = new Square("Kwadrat2", 12.12);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);

            //When
            shapeCollector.removeFigure(square1);

            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());

        }

        @Test
        void testRemoveFigure_ifListIsEmpty() {
            //Given
            Circle shape1 = new Circle("Kolo", 12.32);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            boolean result = shapeCollector.removeFigure(shape1);

            //Then
            Assertions.assertFalse(result);

        }
    }

    @Test
    void testGetFigure() {
        //Given
        Square square1 = new Square("Kwadrat", 12.11);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square1);
        //When
        Shape squere2 = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(square1,squere2);

    }


    @Test
    void testShowFigures() {
        //Given
        Square square1 = new Square("Kwadrat", 12.11);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square1);
        //When
        String shapesShow = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals(square1.toString(),shapesShow);

    }

}
