package com.examples.creational.factory;
public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product p1 = creator.factoryMethod("A");
        p1.info();
        Product p2 = creator.factoryMethod("B");
        p2.info();
    }
}
