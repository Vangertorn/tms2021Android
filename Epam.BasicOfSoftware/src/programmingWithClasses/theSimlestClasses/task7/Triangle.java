package programmingWithClasses.theSimlestClasses.task7;

public class Triangle {
    private final double[] coordinatesA;
    private final double[] coordinatesB;
    private final double[] coordinatesC;
    private final double sideAB;
    private final double sideBC;
    private final double sideAC;


    public Triangle(double[] coordinatesA, double[] coordinatesB, double[] coordinatesC) {
        this.coordinatesA = coordinatesA;
        this.coordinatesB = coordinatesB;
        this.coordinatesC = coordinatesC;
        sideAB = Math.pow((Math.pow((coordinatesB[0]-coordinatesA[0]),2) + Math.pow((coordinatesB[1]-coordinatesA[1]),2)),0.5);
        sideBC = Math.pow((Math.pow((coordinatesC[0]-coordinatesB[0]),2) + Math.pow((coordinatesC[1]-coordinatesB[1]),2)),0.5);
        sideAC = Math.pow((Math.pow((coordinatesA[0]-coordinatesC[0]),2) + Math.pow((coordinatesA[1]-coordinatesC[1]),2)),0.5);
    }

    public double perimeterTriangle(){
        return sideAB + sideAC + sideBC;
    }
    public double squareTriangle(){
        return Math.pow((perimeterTriangle()/2*(perimeterTriangle()/2-sideAB)*(perimeterTriangle()/2-sideBC)*(perimeterTriangle()/2-sideAC)),0.5);
    }
    public double[] pointCrossMedians(){
        double coordinatesX = (coordinatesA[0]+coordinatesB[0]+coordinatesC[0])/3;
        double coordinatesY = (coordinatesA[1]+coordinatesB[1]+coordinatesC[1])/3;
        return new double[]{coordinatesX,coordinatesY};
    }



}
