package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskNameClass.SHOPPING_TASK);
        String result = shopping.executeTask();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals("Purchased Brick in the amount of 4000.0 pieces", result);
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskNameClass.DRIVING_TASK);
        String result = driving.executeTask();
        //Then
        assertEquals("Expedition", driving.getTaskName());
        assertEquals("Travelling by Airplane to New York", result);
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskNameClass.PAINTING_TASK);
        String result = painting.executeTask();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals("Painted Walls in color Blue", result);
        assertTrue(painting.isTaskExecuted());
    }
}
