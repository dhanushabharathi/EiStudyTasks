package com.examples.behavioral.observer;
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
