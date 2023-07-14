package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final Task makeTask(final TaskNameClass taskNameClass) {
        return switch (taskNameClass) {
            case DRIVING_TASK -> new DrivingTask("Expedition", "New York", "Airplane");
            case PAINTING_TASK -> new PaintingTask("Painting", "Blue", "Walls");
            case SHOPPING_TASK -> new ShoppingTask("Shopping", "Brick", 4000);
        };
    }
}
