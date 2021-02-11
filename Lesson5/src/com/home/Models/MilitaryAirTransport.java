package com.home.Models;

import java.util.Random;

public class MilitaryAirTransport extends AirTransport {

    private boolean catapultSystem;
    private byte rocketsNumber;

    public MilitaryAirTransport(float powerOutput,
                                float maxSpeed,
                                float weight,
                                String make,
                                double wingspan,
                                double longRunways,
                                boolean catapultSystem,
                                byte rocketsNumber) {
        super(powerOutput, maxSpeed, weight, make, wingspan, longRunways);
        this.catapultSystem = catapultSystem;
        this.rocketsNumber = rocketsNumber;
    }


    public void info() {
        System.out.println("MilitaryAirTransport");
        System.out.print("powerOutput\t" + rocketsNumber + "\tcatapultSystem\t" +
                catapultSystem + "\tlongRunways\t" + getLongRunways() + "\twingspan\t"
                + getWingspan() + "\tmake\t" + getMake() + "\tweight\t" + getWeight()
                + "\tmaxSpeed\t" + getMaxSpeed() + "\tpower\t" + transferPowerInKwt(getPowerOutput()) + "\n");

    }

    public void shot() {
        if (!catapultSystem) {
            System.out.println("Pilot left out");
            return;
        }
        if (rocketsNumber != 0) {
            System.out.println("The rocket went");
            this.rocketsNumber--;
        } else {
            System.out.println("No ammunition available");
        }

    }

    public void catapult() {
        Random random = new Random();
        int r = random.nextInt(100);
//        System.out.println(r);
        if (!catapultSystem) {
            System.out.println("There is no way out prepare for death, please");
            return;
        }
        if (25 < r && r < 75) {
            System.out.println("The catapult was completed");
            catapultSystem = !catapultSystem;
        } else {
            System.out.println("Please try again!!");
        }

    }

}
