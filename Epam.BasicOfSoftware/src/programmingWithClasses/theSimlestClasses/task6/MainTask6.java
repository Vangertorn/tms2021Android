package programmingWithClasses.theSimlestClasses.task6;

public class MainTask6 {
    public static void main(String[] args) {
        Time time = new Time(9,12,30);
        time.decreaseTime(-2,5,10);
        time.addTime(1,40,35);
        time.timeInfo();
    }

}
