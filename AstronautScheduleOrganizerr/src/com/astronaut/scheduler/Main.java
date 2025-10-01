package com.astronaut.scheduler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(conflictTask -> System.out.println("Error: Task conflicts with existing task \"" + conflictTask + "\""));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nAstronaut Daily Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter start time (HH:mm): ");
                    String start = sc.nextLine();
                    System.out.print("Enter end time (HH:mm): ");
                    String end = sc.nextLine();
                    System.out.print("Enter priority (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    try {
                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        if (manager.addTask(task)) {
                            System.out.println("Task added successfully. No conflicts.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Enter task description to remove: ");
                    String removeDesc = sc.nextLine();
                    if (manager.removeTask(removeDesc)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Error: Task not found.");
                    }
                    break;

                case "3":
                    manager.viewTasks();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

