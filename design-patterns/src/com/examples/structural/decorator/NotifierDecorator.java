package com.examples.structural.decorator;
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;
    public NotifierDecorator(Notifier n) { this.wrappee = n; }
    public void send(String message) { wrappee.send(message); }
}
