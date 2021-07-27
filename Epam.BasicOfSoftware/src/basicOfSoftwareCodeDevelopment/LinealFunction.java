package basicOfSoftwareCodeDevelopment;

import java.util.Random;

public class LinealFunction {

    public LinealFunction() {
    }

    public int task1() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();
        if (b == 0) {
            System.out.println("Divide by zero");
            return 0;
        }
        int z = 0;
        z = ((a - 3) * b / 2) + c;

        return z;

    }

    public double task2() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();
        if (a == 0) {
            System.out.println("Divide by zero");
            return 0;
        }
        double z = (Math.pow(b, 2) + 4 * a * c);
        if (z < 0) {
            System.out.println("Extracting the root of a negative number");
            return 0;

        }
        z = (b + Math.pow(z, 0.5) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
        return z;

    }

    public double task3() {
        Random random = new Random();
        int x = random.nextInt(821) - 360;
        int y = random.nextInt(821) - 360;
        double z = (Math.cos(x) - Math.sin(y));
        if (z == 0) {
            System.out.println("Divide by zero");
            return 0;
        }
        double answer = (Math.sin(x) + Math.cos(y)) / z * Math.tan(x * y);
        return answer;

    }

    public double task4(double a) {
        String originalNumber = Double.toString(a);
        char[] c = originalNumber.toCharArray();
        char tempt0 = c[0];
        char tempt1 = c[1];
        char tempt2 = c[2];
        c[0] = c[6];
        c[1] = c[5];
        c[2] = c[4];
        c[4] = tempt2;
        c[5] = tempt1;
        c[6] = tempt0;
        String swappedNumber = new String(c);
//        System.out.println(originalNumber);
//        System.out.println(swappedNumber);
        Double number = Double.valueOf(swappedNumber);
        return number;

    }

    public void task5(int a) {
        int hour = a / 3600;
        int minutes = (a % 3600) / 60;
        int second = (a % 60);
        System.out.println(hour + "\thour\t" + minutes + "\tminutes\t" + second + "\tsecond");

    }

    public void task6(int x, int y) {
        if (x == 0 && y == -1) {
            System.out.println("False");
        } else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println("True");
        } else if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

