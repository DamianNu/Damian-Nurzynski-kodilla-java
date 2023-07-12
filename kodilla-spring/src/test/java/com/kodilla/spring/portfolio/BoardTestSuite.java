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
        TaskList taskList4 = board1.getToDoList();
        List<String> taskList = taskList4.getTasks();
        taskList.add("task");

        TaskList taskList1 = context.getBean("toDoList", TaskList.class);
        TaskList taskList2 = context.getBean("inProgressList", TaskList.class);
        TaskList taskList3 = context.getBean("doneList", TaskList.class);

        //When
        taskList1.getTasks().add("Task toDo");
        taskList2.getTasks().add("Task inProgress");
        taskList3.getTasks().add("Task done");

        //Then
        assertEquals("task", taskList.get(0));

        assertEquals("Task toDo", taskList1.getTasks().get(0));
        assertEquals("Task inProgress", taskList2.getTasks().get(0));
        assertEquals("Task done", taskList3.getTasks().get(0));

    }
}
