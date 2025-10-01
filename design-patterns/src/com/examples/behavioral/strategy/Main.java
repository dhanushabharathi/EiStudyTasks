package com.examples.behavioral.strategy;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardStrategy("4111-1111-1111-1111"));
        cart.checkout(1200);
        cart.setPaymentStrategy(new UPIStrategy("alice@upi"));
        cart.checkout(450);
    }
}
