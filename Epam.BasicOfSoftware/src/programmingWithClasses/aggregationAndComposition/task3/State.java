package programmingWithClasses.aggregationAndComposition.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class State {
    private Town capital;
    private double square;
    private String name;
    private LinkedList<Area> areas;

    public State(String name, Area[] areas) {
        this.name = name;
        this.areas = new LinkedList<>();
        this.areas.addAll(Arrays.asList(areas));
        for (Area area : areas) {
            square += area.getSquare();
        }
        capital = this.areas.get(new Random().nextInt(this.areas.size())).getCapital();
    }

    public void capitalState() {
        System.out.println(capital + " is capital " + name);

    }

    public void numberArea() {
        System.out.println(name + " have " + areas.size() + " areas");

    }

    public void squareState() {
        System.out.println(name + " have square " + square);

    }

    public void capitalAreaAll() {

        for (Area area : areas) {
            System.out.println(area.getCapital() + " is capital " + area.getName()+" area.");
        }


    }
}
