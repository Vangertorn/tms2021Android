package basicOfSoftwareCodeDevelopment;

public class Branches {
    public void task1(double a, double b) {
        if (a <= 0 && b <= 0 && (a + b) >= 180) {
            System.out.println("This triangle can't be building");
        }
        if (a == 90 || b == 90 || (180 - (a + b)) == 90) {
            System.out.println("This triangle is rectangular");
        } else {
            System.out.println("This triangle can be building");
        }
    }

    public void task2(int a, int b, int c, int d) {
        int max = a;

        if (a < b) {
            max = b;
        }
        if (a == b) {
            System.out.println("Numbers a and b equal");
        }
        int min = c;
        if (d < c) {
            min = d;
        }
        if (c == d) {
            System.out.println("Numbers c and d equal");
        }
        System.out.println(max);
        System.out.println(min);
    }

    public void task3(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points A,B,C are at one line");
        } else {
            System.out.println("Points A,B,C don't are at one line");
        }
    }

    public void task4(int a, int b, int x, int y, int z) {
        int min1Brick = x;
        if (x > y) {
            min1Brick = y;
            y = 0;
        }
        if (y > z) {
            min1Brick = z;
            z = 0;
        }
        if (min1Brick == x) {
            x = 0;
        }
        int min2Brick;
        if (x != 0) {
            min2Brick = x;
        } else {
            min2Brick = y;
        }

        if (x > y && y != 0) {
            min2Brick = y;
        }
        if (x > z && z != 0) {
            min2Brick = z;
        }
        if (y > z && z != 0 && y != 0) {
            min2Brick = z;
        }
        int maxHole = a;
        int minHole = b;
        if (b > a) {
            minHole = a;
            maxHole = b;
        }
        if (maxHole > min2Brick && minHole > min1Brick) {
            System.out.println("The Brick included in the hole perfectly");
        } else if (maxHole == min2Brick || minHole == min1Brick) {
            System.out.println("The Brick included in the hole difficulty");
        } else {
            System.out.println("The Brick didn't included. You must use lubricant or tools");
        }

    }

    public double task5(int x) {
        double a;
        if (x <= 3) {
            a = x * x - 3 * x + 9;
        } else {
            a = 1 / (Math.pow(x, 3) + 6);
        }
        return a;
    }

}
