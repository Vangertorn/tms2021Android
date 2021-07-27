package basicOfOOP.task3;

public class Day {
    private String name;
    private int numberDayOfWeek;
    private boolean count;

    public Day(int numberDayOfWeek, boolean count) {
        this.numberDayOfWeek = numberDayOfWeek;
        this.count = count;
    }


    public int getNumberDayOfWeek() {
        return numberDayOfWeek;
    }

    public boolean isCount() {
        return count;
    }

}
