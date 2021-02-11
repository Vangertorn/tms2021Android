package com.home.Models;

public class PassengerTransport extends GroundTransport {
    private String typeBody;
    private short passengerNumber;

    public PassengerTransport(float powerOutput,
                              float maxSpeed,
                              float weight,
                              String make,
                              byte wheelNumber,
                              double fuelFlow,
                              String typeBody,
                              short passengerNumber) {
        super(powerOutput, maxSpeed, weight, make, wheelNumber, fuelFlow);
        this.typeBody = typeBody;
        this.passengerNumber = passengerNumber;
    }

    public void kilometrage(int time) {
        double distance;
        distance = (double) time / 60 * getMaxSpeed();
        System.out.println("For the time\t" + time + "\tminutes" + "\nAuto\t" + getMake() + "\nmove with maximal speed\t" + getMaxSpeed() + "km/auer" +
                "\ndrove\t" + distance + "\tkm" + "\nand spend\t" + fuelCalculation(time) + "\tliters of fuel");
    }

    private double fuelCalculation(int time) {
        double howFuelSpent;
        howFuelSpent = (double)time / 60 * getMaxSpeed() * getFuelFlow() / 100;
        System.out.println();

        return howFuelSpent;

    }

    public void info() {
        System.out.println("PassengerTransport");
        System.out.print("typeBody\t" + typeBody + "\tpassengerNumber\t" + passengerNumber +
                "\tfuelFlow\t" + getFuelFlow() + "\twheelNumber\t"
                + getWheelNumber() + "\tmake\t" + getMake() + "\tweight\t" + getWeight()
                + "\tmaxSpeed\t" + getMaxSpeed() + "\tpower\t" + transferPowerInKwt(getPowerOutput()) + "\n");

    }
}
