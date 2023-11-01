package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void updateQueueHomework(QueueHomework queueHomework) {
        System.out.println("New homework to check with " + queueHomework.getName() + "\n" +
                " (total: " + queueHomework.getTaskMessages().size() + " homeworks.");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
