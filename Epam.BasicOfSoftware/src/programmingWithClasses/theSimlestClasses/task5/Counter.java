package programmingWithClasses.theSimlestClasses.task5;

public class Counter {
    private int condition;

    public Counter() {
        condition = 0;
    }

    public Counter(int condition) {
        this.condition = condition;
    }

    public void addCounter(int n){
       condition= getCondition()+n;
    }
    public void decreaseCounter(int n){
        condition= getCondition()-n;
    }

    public int getCondition() {
        return condition;
    }
}
