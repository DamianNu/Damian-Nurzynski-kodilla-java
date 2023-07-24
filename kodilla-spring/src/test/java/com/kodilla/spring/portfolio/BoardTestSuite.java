package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board1 = context.getBean(Board.class);

        TaskList taskList1 = board1.getToDoList();
        TaskList taskList2 = board1.getInProgressList();
        TaskList taskList3 = board1.getDoneList();

        //When
        taskList1.getTasks().add("Task toDo");
        taskList2.getTasks().add("Task inProgress");
        taskList3.getTasks().add("Task done");

        //Then
        assertEquals("Task toDo", taskList1.getTasks().get(0));
        assertEquals("Task inProgress", taskList2.getTasks().get(0));
        assertEquals("Task done", taskList3.getTasks().get(0));

    }
}
