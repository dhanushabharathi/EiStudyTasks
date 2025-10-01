package com.examples.structural.decorator;
public class Main {
    public static void main(String[] args) {
        Notifier basic = new BasicNotifier();
        Notifier withSms = new SMSDecorator(basic);
        Notifier withEmailAndSms = new EmailDecorator(withSms);
        withEmailAndSms.send("Hello Decorator!");
    }
}
