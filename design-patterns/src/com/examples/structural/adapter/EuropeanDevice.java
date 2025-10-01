package com.examples.structural.adapter;
public class EuropeanDevice implements EuroPlug {
    public void provideElectricity() {
        System.out.println("European device running on 2-pin supply");
    }
}
