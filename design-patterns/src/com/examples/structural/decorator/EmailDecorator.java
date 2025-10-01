package com.examples.structural.decorator;
public class EmailDecorator extends NotifierDecorator {
    public EmailDecorator(Notifier n) { super(n); }
    public void send(String message) {
        super.send(message);
        System.out.println("Also sending Email: " + message);
    }
}
