package com.examples.structural.adapter;
public class Main {
    public static void main(String[] args) {
        EuropeanDevice device = new EuropeanDevice();
        IndianSocket adapter = new EuroToIndianAdapter(device);
        adapter.provideElectricityThreePin();
    }
}
