package com.examples.creational.builder;
public class Product {
    private final String name;
    private final int weight;
    private final boolean fragile;
    private Product(Builder b) {
        this.name = b.name;
        this.weight = b.weight;
        this.fragile = b.fragile;
    }
    public String toString() {
        return "Product[name=" + name + ", weight=" + weight + ", fragile=" + fragile + "]";
    }
    public static class Builder {
        private String name;
        private int weight;
        private boolean fragile;
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setWeight(int w) { this.weight = w; return this; }
        public Builder setFragile(boolean f) { this.fragile = f; return this; }
        public Product build() { return new Product(this); }
    }
}
