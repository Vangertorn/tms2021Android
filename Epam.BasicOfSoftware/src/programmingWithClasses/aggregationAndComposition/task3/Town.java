package programmingWithClasses.aggregationAndComposition.task3;

public class Town {
    private String name;
    private double square;

    public Town(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
