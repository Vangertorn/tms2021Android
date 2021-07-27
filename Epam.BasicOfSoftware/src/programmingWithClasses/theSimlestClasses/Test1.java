package programmingWithClasses.theSimlestClasses;

public class Test1 {
    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        if (a > b) return a;
        else return b;
    }

    public int getA() {
        System.out.println(a);
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        System.out.println(b);
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
