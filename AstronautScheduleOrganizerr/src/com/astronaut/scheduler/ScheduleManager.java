package com.astronaut.scheduler;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (TaskObserver observer : observers) {
            observer.onTaskConflict(message);
        }
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (isOverlap(t, task)) {
                notifyObservers(t.getDescription());
                return false;
            }
        }
        tasks.add(task);
        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        return true;
    }

    public boolean removeTask(String description) {
        return tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    private boolean isOverlap(Task t1, Task t2) {
        return t1.getStartTime().isBefore(t2.getEndTime()) && t2.getStartTime().isBefore(t1.getEndTime());
    }
}

