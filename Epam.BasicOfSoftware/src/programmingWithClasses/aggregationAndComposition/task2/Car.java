package programmingWithClasses.aggregationAndComposition.task2;

import java.util.Arrays;

public class Car {
    private Engine engine;
    private Wheel[] wheel;
    private double amountFuel;
    private int tankCapacity;
    private int numberWheels;
    private String markCar;


    public Car(Engine engine, Wheel[] wheel, double amountFuel, int tankCapacity, int numberWheels, String markCar) {

        this.engine = engine;
        this.wheel = wheel;
        this.amountFuel = amountFuel;
        this.tankCapacity = tankCapacity;
        this.numberWheels = numberWheels;
        this.markCar = markCar;

    }

    public void runCar(int kilometers) {
        for (int i = 0; i<wheel.length;i++){
            if(!wheel[i].getCount()){
                System.out.println("Wheel number "+i+" is brooke");
                return;
            }
        }
        if (amountFuel > 0) engine.startEngine();

        if (numberWheels == wheel.length) {
            for (Wheel w : wheel) {
                w.spinWheels();
            }
        }
        if (engine.getFuelConsumption() / 100 * kilometers > amountFuel) {
            System.out.println("You stopped, because you didn't refuel your car");
        } else {
            System.out.println("You arrived at your destination");
            amountFuel = amountFuel-engine.getFuelConsumption() / 100 * kilometers;
        }
        engine.stopEngine();
    }

    public void refuelCar(double amount) {
        amountFuel = amountFuel + amount;
        if (amountFuel > tankCapacity) {
            amountFuel = tankCapacity;
        }
    }

    public void replaceWheel(Wheel wheel, int wheelNumber) {
        if (wheelNumber >= this.wheel.length) System.out.println("You entered incorrect wheel number");
        else {
            this.wheel[wheelNumber] = wheel;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + Arrays.toString(wheel) +
                ", amountFuel=" + amountFuel +
                ", tankCapacity=" + tankCapacity +
                ", numberWheels=" + numberWheels +
                ", markCar='" + markCar + '\'' +
                '}';
    }
}
