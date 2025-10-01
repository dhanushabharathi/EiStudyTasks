package com.examples.behavioral.observer;
public class PhoneSubscriber implements Observer {
    private String name;
    public PhoneSubscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println("[Phone] " + name + " received: " + message);
    }
}
