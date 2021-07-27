package programmingWithClasses.aggregationAndComposition.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Car car = new Car(new Engine("BMV",350,22),new Wheel[]{new Wheel("Winter",true,"19"),
                new Wheel("Winter",true,"19"),new Wheel("Winter",true,"19"),
                new Wheel("Winter",true,"19")},25,40,4,"BMW X1 xDrive18d");
        car.runCar(100);
        System.out.println(car.toString());
        car.refuelCar(23.2);
        System.out.println(car.toString());
        car.replaceWheel(new Wheel("Summer",false,"19"),0);
        System.out.println(car.toString());
        car.runCar(20);
    }
}
