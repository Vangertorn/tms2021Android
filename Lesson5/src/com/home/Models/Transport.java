package com.home.Models;

public class Transport {

    private float powerOutput;
    private float maxSpeed;
    private float weight;
    private String make;

    public Transport(float powerOutput,
                     float maxSpeed,
                     float weight,
                     String make) {
        this.powerOutput = powerOutput;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.make = make;
    }

    public float transferPowerInKwt(float powerOutput) {
        float power = (float) (powerOutput * 0.74);
        return power;
    }

    public float getPowerOutput() {
        return powerOutput;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getWeight() {
        return weight;
    }

    public String getMake() {
        return make;
    }
}
