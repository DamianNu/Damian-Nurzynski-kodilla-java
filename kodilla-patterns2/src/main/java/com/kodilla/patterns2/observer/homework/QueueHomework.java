package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueHomework implements Observable {
    private final List<Observer> observers;
    private final List<String> taskMessages;
    private final String name;

    public QueueHomework(String name) {
        observers = new ArrayList<>();
        taskMessages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        taskMessages.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentor() {
        for (Observer observer : observers) {
            observer.updateQueueHomework(this);
        }
    }

    @Override
    public void removeMentor(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTaskMessages() {
        return taskMessages;
    }

    public String getName() {
        return name;
    }
}
