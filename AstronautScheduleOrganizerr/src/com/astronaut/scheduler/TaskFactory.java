package com.astronaut.scheduler;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TaskFactory {

    public static Task createTask(String description, String startTimeStr, String endTimeStr, String priority) throws IllegalArgumentException {
        try {
            LocalTime startTime = LocalTime.parse(startTimeStr);
            LocalTime endTime = LocalTime.parse(endTimeStr);

            if (endTime.isBefore(startTime) || endTime.equals(startTime)) {
                throw new IllegalArgumentException("End time must be after start time.");
            }

            return new Task(description, startTime, endTime, priority);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid time format. Use HH:mm (24-hour).");
        }
    }
}
