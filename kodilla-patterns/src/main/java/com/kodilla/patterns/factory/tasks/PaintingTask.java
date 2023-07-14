package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean taskStatus;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.taskStatus = false;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String executeTask() {
        String result = "Painted " + whatToPaint + " in color " + color;
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
