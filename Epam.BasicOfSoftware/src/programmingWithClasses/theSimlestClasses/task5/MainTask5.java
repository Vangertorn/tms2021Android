package programmingWithClasses.theSimlestClasses.task5;

public class MainTask5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.addCounter(5);
        counter.decreaseCounter(4);
        System.out.println(counter.getCondition());

    }
}
