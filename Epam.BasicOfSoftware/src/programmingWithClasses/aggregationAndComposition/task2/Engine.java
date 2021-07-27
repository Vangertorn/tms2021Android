package programmingWithClasses.aggregationAndComposition.task2;

public class Engine {
    private  String  mark;
    private int output;
    private double fuelConsumption;

    public Engine(String mark, int output,double fuelConsumption) {
        this.mark = mark;
        this.output = output;
        this.fuelConsumption = fuelConsumption;
    }
    public void startEngine(){
        System.out.println("The engine started ");
    }
    public void stopEngine(){
        System.out.println("The engine stopped");
    }

    public String getMark() {
        return mark;
    }

    public int getOutput() {
        return output;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelConsumption=" + fuelConsumption +
                '}';
    }
}
