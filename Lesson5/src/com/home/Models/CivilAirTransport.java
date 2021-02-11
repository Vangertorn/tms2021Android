package com.home.Models;

public class CivilAirTransport extends AirTransport {
    private int passengerNumber;
    private boolean businessClass;

    public CivilAirTransport(float powerOutput,
                             float maxSpeed,
                             float weight,
                             String make,
                             double wingspan,
                             double longRunways,
                             int passengerNumber,
                             boolean businessClass) {
        super(powerOutput, maxSpeed, weight, make, wingspan, longRunways);
        this.passengerNumber = passengerNumber;
        this.businessClass = businessClass;
    }

    public void info() {
        System.out.println("CivilAirTransport");
        System.out.print("businessClass\t" + businessClass + "\tpassengerNumber\t" +
                passengerNumber + "\tlongRunways\t" + getLongRunways() + "\twingspan\t"
                + getWingspan() + "\tmake\t" + getMake() + "\tweight\t" + getWeight()
                + "\tmaxSpeed\t" + getMaxSpeed() + "\tpower\t" + transferPowerInKwt(getPowerOutput()) + "\n");

    }

    public void checkingForCapacity(int passengerNumber) {
        if (passengerNumber > this.passengerNumber) {
            System.out.println("You need plane more bigger");
        } else {
            System.out.println("Plane was uploaded");
        }
    }

}
