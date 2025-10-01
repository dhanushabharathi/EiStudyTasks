package com.examples.structural.adapter;
public class EuroToIndianAdapter implements IndianSocket {
    private EuroPlug plug;
    public EuroToIndianAdapter(EuroPlug plug) { this.plug = plug; }
    public void provideElectricityThreePin() {
        System.out.println("Adapter converts 2-pin to 3-pin...");
        plug.provideElectricity();
    }
}
