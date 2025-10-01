package com.examples.behavioral.strategy;
public class UPIStrategy implements PaymentStrategy {
    private String upiId;
    public UPIStrategy(String upiId) { this.upiId = upiId; }
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI: " + upiId);
    }
}
