package basicOfSoftwareCodeDevelopment;

import java.math.BigInteger;
import java.util.*;

public class Cycles {
    public int task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter number, please");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("You entered false number");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public void task2(double a, double b, double h) {
        double longSegment = b - a;
        double y = 0;
        if (longSegment <= 0) {
            System.out.println("Length the segment is false");
            return;
        }
        for (double i = a; i <= b; i = i + h) {
            if (i > 2) {
                y = y + i;

            } else {
                y = y - i;
            }
        }
        System.out.println(y);
    }

    public int task3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    public void task4() {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            sum = sum.multiply(BigInteger.valueOf(i * i));

        }
        System.out.println(sum);
    }

    public void task5(int size, double e) {
        double sum = 0;
        double arrays[] = new double[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
            if (arrays[i] >= e) {
                sum = sum + arrays[i];
            }
        }
        System.out.println(sum);
    }

    public void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter characters");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int[] numbers = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            numbers[i] = (int) chars[i];
            System.out.println(chars[i] + "\tis\t" + numbers[i]);
        }
    }

    public void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter m, please");
        int m = scanner.nextInt();
        System.out.println("Can you enter n, please");
        int n = scanner.nextInt();

        for (int i = m + 1; i < n; i++) {
            List<Integer> divisors = new LinkedList<>();
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                }
            }
            if (divisors.size() > 0) {
                System.out.print("Number\t" + i + "\tis divisors\t");

                for (Integer k : divisors) {
                    System.out.print(k + ",\t");
                }
                System.out.println();
            } else {
                System.out.println("Number\t" + i + "\tis natural");
            }
        }
    }

    public void task8(int a, int b) {
//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Can you enter a, please");
//        int a = scanner.nextInt();
//        System.out.println("Can you enter b, please");
//        int b = scanner.nextInt();
        List<Integer> numberA = new LinkedList<>();
        List<Integer> numberB = new LinkedList<>();
        List<Integer> generalNumber = new LinkedList<>();
        if (a < 0) {
            a = a * -1;
        }
        if (b < 0) {
            b = b * -1;
        }
        while (a > 0) {
            numberA.add(a % 10);
            a = a / 10;
        }
        while (b > 0) {
            numberB.add(b % 10);
            b = b / 10;
        }
        for (int i = 0; i < numberA.size(); i++) {
            for (int j = 0; j < numberB.size(); j++) {
                if (numberA.get(i) == numberB.get(j)) {
                    generalNumber.add(numberA.get(i));
                }
            }

        }
        Set<Integer> set = new HashSet<>(generalNumber);
        generalNumber.clear();
        generalNumber.addAll(set);
        System.out.println(generalNumber.toString());
    }

}
