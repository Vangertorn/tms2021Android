package programmingWithClasses.theSimlestClasses.task7;

import java.util.Arrays;

public class MainTask7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new double[]{-2,-2},new double[]{-1,1},new double[]{1,-1});
        System.out.println(triangle.perimeterTriangle());
        System.out.println(triangle.squareTriangle());
        System.out.println(Arrays.toString(triangle.pointCrossMedians()));
    }

}
