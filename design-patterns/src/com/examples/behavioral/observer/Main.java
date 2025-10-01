package com.examples.behavioral.observer;
public class Main {
    public static void main(String[] args) throws Exception {
        NewsPublisher publisher = new NewsPublisher();
        PhoneSubscriber alice = new PhoneSubscriber("Alice");
        PhoneSubscriber bob = new PhoneSubscriber("Bob");
        publisher.register(alice);
        publisher.register(bob);
        publisher.setNews("Breaking: Design patterns made simple!");
        publisher.unregister(bob);
        publisher.setNews("Update: Bob unsubscribed.");
    }
}
