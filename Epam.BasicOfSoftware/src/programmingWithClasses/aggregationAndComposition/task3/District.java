package programmingWithClasses.aggregationAndComposition.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class District {
    private String name;
    private LinkedList<Town> towns;
    private double square;
    private Town capital;

    public District(String name, Town[] towns) {
        this.name = name;
        this.towns = new LinkedList<>();
        this.towns.addAll(Arrays.asList(towns));
        capital = this.towns.get(new Random().nextInt(this.towns.size()));
        square = 0;
        for(Town t: towns){
            square+=t.getSquare()*3;
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Town> getTowns() {
        return towns;
    }

    public double getSquare() {
        return square;
    }

    public Town getCapital() {
        return capital;
    }
}
