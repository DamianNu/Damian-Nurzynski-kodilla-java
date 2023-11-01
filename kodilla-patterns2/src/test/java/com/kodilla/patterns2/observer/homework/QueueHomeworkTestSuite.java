package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueHomeworkTestSuite {
    @Test
    public void updateQueueHomework() {
        // Given
        QueueHomework studentA = new StudentA();
        QueueHomework studentB = new StudentB();
        QueueHomework studentC = new StudentC();
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        Mentor mentor3 = new Mentor("Mentor 3");
        studentA.registerMentor(mentor1);
        studentB.registerMentor(mentor2);
        studentC.registerMentor(mentor3);
        // When
        studentA.addTask("Task 1 'first task completed'");
        studentA.addTask("Task 2 'next task completed'");
        studentB.addTask("Task 1 'last task completed'");
        studentB.addTask("Task 2 'problem with the task'");
        studentB.addTask("Task 3 'job done'");
        studentC.addTask("Task 1 'task completed'");
        studentC.addTask("Task 2 'task test 2'");
        // Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
        assertEquals(2, mentor3.getUpdateCount());
    }
}