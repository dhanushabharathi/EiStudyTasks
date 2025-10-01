package com.examples.creational.builder;
public class Main {
    public static void main(String[] args) {
        Product p = new Product.Builder()
            .setName("Vase")
            .setWeight(1200)
            .setFragile(true)
            .build();
        System.out.println(p);
    }
}
