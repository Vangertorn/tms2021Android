package programmingWithClasses.aggregationAndComposition.task2;

public class Wheel {
    private String rubber;
    private boolean count;
    private String diameter;

    public Wheel(String rubber, boolean count, String diameter) {
        this.rubber = rubber;
        this.count = count;
        this.diameter = diameter;
    }
    public void spinWheels(){
        if (count) System.out.println("Wheels start to spin");
        else System.out.println("You broke the wheel");
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "count=" + count +
                '}';
    }

    public boolean getCount() {
        return count;
    }
}
