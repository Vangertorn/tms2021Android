package com.home.Models;

public class CargoTransport extends GroundTransport {

    private double tonnage;

    public CargoTransport(float powerOutput,
                          float maxSpeed,
                          float weight,
                          String make,
                          byte wheelNumber,
                          double fuelFlow,
                          double tonnage) {
        super(powerOutput, maxSpeed, weight, make, wheelNumber, fuelFlow);
        this.tonnage = tonnage;
    }

    public void info() {
        System.out.println("CargoTransport");
        System.out.print("tonnage\t" + tonnage + "\tfuelFlow\t" + getFuelFlow() + "\twheelNumber\t"
                + getWheelNumber() + "\tmake\t" + getMake() + "\tweight\t" + getWeight()
                + "\tmaxSpeed\t" + getMaxSpeed() + "\tpower\t" + transferPowerInKwt(getPowerOutput()) + "\n");

    }

    public void checkingForCapacity(double tonnage) {
        if (tonnage > this.tonnage) {
            System.out.println("You need CargoTransport more bigger");
        } else {
            System.out.println("CargoTransport was uploaded");
        }
    }
}
