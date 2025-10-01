package com.astronaut.scheduler;

public interface TaskObserver {
    void onTaskConflict(String conflictingTaskDescription);
}

