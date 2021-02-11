package com.home.Models;

public class GroundTransport extends Transport {

    private byte wheelNumber;
    private double fuelFlow;

    public GroundTransport(float powerOutput,
                           float maxSpeed,
                           float weight,
                           String make,
                           byte wheelNumber,
                           double fuelFlow) {
        super(powerOutput, maxSpeed, weight, make);
        this.wheelNumber = wheelNumber;
        this.fuelFlow = fuelFlow;
    }

    public byte getWheelNumber() {
        return wheelNumber;
    }

    public double getFuelFlow() {
        return fuelFlow;
    }
}
