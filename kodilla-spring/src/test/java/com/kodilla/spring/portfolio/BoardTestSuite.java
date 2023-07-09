package com.kodilla.spring.portfolio;

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
        TaskList taskList1 = context.getBean("toDoList", TaskList.class);
        TaskList taskList2 = context.getBean("inProgressList", TaskList.class);
        TaskList taskList3 = context.getBean("doneList", TaskList.class);

        //When
        taskList1.getTasks().add("Task toDo");
        taskList2.getTasks().add("Task inProgress");
        taskList3.getTasks().add("Task done");

        //Then
        assertEquals("Task toDo",taskList1.getTasks().get(0));
        assertEquals("Task inProgress",taskList2.getTasks().get(0));
        assertEquals("Task done",taskList3.getTasks().get(0));

    }
}
