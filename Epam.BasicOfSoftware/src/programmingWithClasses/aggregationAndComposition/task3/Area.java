package programmingWithClasses.aggregationAndComposition.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Area {
    private String name;
    private LinkedList<District> districts;
    private Town capital;
    private double square;

    public Area(String name,District[] districts) {
        this.name = name;
        this.districts =new LinkedList<>();
        this.districts.addAll(Arrays.asList(districts));
        square = 0;
        for(District district: districts){
            square+=district.getSquare();
        }
        capital = this.districts.get(new Random().nextInt(this.districts.size())).getCapital();
    }

    public String getName() {
        return name;
    }

    public LinkedList<District> getDistricts() {
        return districts;
    }

    public Town getCapital() {
        return capital;
    }

    public double getSquare() {
        return square;
    }
}
