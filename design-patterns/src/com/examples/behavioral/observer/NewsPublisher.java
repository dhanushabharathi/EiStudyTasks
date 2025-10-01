package com.examples.behavioral.observer;
import java.util.*;
public class NewsPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
    public void register(Observer o) { observers.add(o); }
    public void unregister(Observer o) { observers.remove(o); }
    public void notifyObservers() {
        for (Observer o : observers) o.update(news);
    }
}
