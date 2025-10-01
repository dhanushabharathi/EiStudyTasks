package com.examples.creational.factory;
public class ConcreteCreator extends Creator {
    public Product factoryMethod(String type) {
        if ("A".equalsIgnoreCase(type)) return new ConcreteProductA();
        if ("B".equalsIgnoreCase(type)) return new ConcreteProductB();
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
}
