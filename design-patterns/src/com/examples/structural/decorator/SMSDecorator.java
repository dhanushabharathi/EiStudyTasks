package com.examples.structural.decorator;
public class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier n) { super(n); }
    public void send(String message) {
        super.send(message);
        System.out.println("Also sending SMS: " + message);
    }
}
