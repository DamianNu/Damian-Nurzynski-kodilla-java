package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    String taskName;
    String whatToBuy;
    double quantity;
    boolean taskStatus;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskStatus = false;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String executeTask() {
        String result = "Purchased " + whatToBuy + " in the amount of " + quantity + " pieces";
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
