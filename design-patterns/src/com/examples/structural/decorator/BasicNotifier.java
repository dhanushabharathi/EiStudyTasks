package com.examples.structural.decorator;
public class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Basic notification: " + message);
    }
}
