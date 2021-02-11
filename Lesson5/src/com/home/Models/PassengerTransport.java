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

        System.out.printf("For the time\t%s\tminutes\nAuto\t%s\nmove with maximal speed\t%skm/auer\ndrove\t%s\tkm\nand" +
                " spend\t%s\tliters of fuel", time, getMake(), getMaxSpeed(), distance(time), fuelCalculation(time));


    }

    private double distance(int time) {
        double distance;
        distance = (double) time / 60 * getMaxSpeed();
        return distance;
    }


    private double fuelCalculation(int time) {
        double howFuelSpent;
        howFuelSpent = distance(time) * getFuelFlow() / 100;
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
