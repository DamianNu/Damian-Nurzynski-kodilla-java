package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Transactional
@SpringBootTest
class TaskListDaoTestSuit {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("First list", "Homework");

        //When
        taskListDao.save(taskList);

        //Then
        String listName = taskList.getDescription();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        assertTrue(readTaskList.isEmpty());

        //CleanUp
        taskListDao.delete(taskList);
    }
}
