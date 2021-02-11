package com.home.Models;

public class AirTransport extends Transport {

    private double wingspan;
    private double longRunways;

    public double getWingspan() {
        return wingspan;
    }

    public double getLongRunways() {
        return longRunways;
    }

    public AirTransport(float powerOutput,
                        float maxSpeed,
                        float weight,
                        String make,
                        double wingspan,
                        double longRunways) {
        super(powerOutput, maxSpeed, weight, make);
        this.wingspan = wingspan;
        this.longRunways = longRunways;

    }
}

