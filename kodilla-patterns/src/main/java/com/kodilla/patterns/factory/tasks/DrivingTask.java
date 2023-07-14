package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean taskStatus;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskStatus = false;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String executeTask() {
        String result = "Travelling by " + using + " to " + where;
        System.out.println(result);
        this.taskStatus = true;
        return result;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
