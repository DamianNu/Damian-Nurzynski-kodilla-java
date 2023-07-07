package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Task 1");
        System.out.println(board.getToDoList().getTasks().size());
        board.getInProgressList().getTasks().add("Task 2");
        board.getDoneList().getTasks().add("Task 3");

 //       String toDoTask = board.getToDoList().getTasks().get(0);
//        String inProgressTask = board.getInProgressList().getTasks().get(0);
//        String doneTask = board.getDoneList().getTasks().get(0);
        //Then
//        assertEquals("Task 1",toDoTask);
//        assertEquals("Task 2",inProgressTask);
//        assertEquals("Task 3",doneTask);

    }
}
