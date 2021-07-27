package algorithmization;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class DecompositionUsingMethods {
    public static void task1(long a, long b) {
        System.out.printf("Greatest common divisor numbers %d and %d is %d\n", a, b, gsd(a, b));
        System.out.printf("Least common multiple numbers %d and %d is %d\n", a, b, lcm(a, b));
    }

    private static long gsd(long a, long b) {
        return b == 0 ? a : gsd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a / gsd(a, b) * b;
    }

    public static void task2(long a, long b, long c, long d) {
        System.out.printf("Greatest common divisor numbers %d, %d, %d, %d is %d\n", a, b, c, d, gsd4Number(a, b, c, d));
    }

    private static long gsd4Number(long a, long b, long c, long d) {
        if (gsd(a, b) != 1) {
            if (gsd(gsd(a, b), c) != 1) {
                return (gsd(gsd(gsd(a, b), c), d));
            }
            return 1;
        }
        return 1;
    }

    public static void task3(int a) {
        double s = Math.pow(3, 0.5) / 4 * Math.pow(a, 2) * 6;
        System.out.println("The area of a regular hexagon is\t" + s);
    }

    public static void task4(int[][] coordinatesPoints) {
        double length = 0;
        int[] number1 = new int[1];
        int[] number2 = new int[1];
        for (int[] point : coordinatesPoints) {
            for (int[] coordinatesPoint : coordinatesPoints)
                if (getDistance(point, coordinatesPoint) > length) {
                    length = getDistance(point, coordinatesPoint);
                    number1 = point;
                    number2 = coordinatesPoint;
                }
        }
        System.out.printf("Max length is between points x1 = %d, y1 = %d and x2 = %d, y2 = %d\n", number1[0], number1[1], number2[0], number2[1]);
    }

    private static double getDistance(int[] x, int[] y) {
        return Math.pow(Math.pow((y[0] - x[0]), 2) + Math.pow((y[1] - y[0]), 2), 0.5);
    }

    public static void task5(int[] array) {
        int max = array[0];
        int results = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                results = max;
                max = array[i];
            } else if (array[i] > results && array[i] < max) {
                results = array[i];
            }
        }
        System.out.println(results);
    }

    public static void task6(long a, long b, long c) {
        if (gsd(a, b) == 1 || gsd(b, c) == 1 || gsd(a, c) == 1) {
            System.out.printf("Numbers %d, %d, %d are mutually simple\n", a, b, c);
        } else System.out.printf("Numbers %d, %d, %d are NOT mutually simple\n", a, b, c);
    }

    public static void task7(int[] array) {
        long factorialSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                int factorial = 1;
                for (int j = 1; j <= array[i]; j++) {
                    factorial = factorial * j;
                }
                factorialSum += factorial;
            }
        }
        System.out.println(factorialSum);
    }

    public static void task8(int[] array, int start, int finish) {
        int sum;
        for (int i = start; i < finish; i += 3) {
            if (i + 3 <= finish && i + 3 <= array.length) {
                sum = array[i] + array[1 + i] + array[2 + i];
                System.out.printf("%d + %d + %d = %d\n", array[i], array[i + 1], array[i + 2], sum);
            }
        }
    }

    public static void task9(int x, int y, int z, int t) {
        double c = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        double perimeter = (z + t + c) / 2;
        double area = Math.pow((perimeter * (perimeter - z) * (perimeter - t) * (perimeter - c)), 0.5) + x * y * 0.5;
        System.out.println("Area this quadrilateral is\t" + area);
    }

    public static int[] task10(int n) {
        int number = n;
        List<Integer> list = new LinkedList<>();
        while (number > 0) {
            list.add(number % 10);
            number = number / 10;

        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(list.size() - i - 1);
        }
        return array;
    }

    public static void task11(int a, int b) {
        int countA = 0;
        while (a > 0) {
            a = a / 10;
            countA++;
        }
        int countB = 0;
        while (b > 0) {
            b = b / 10;
            countB++;
        }
        if (countA > countB) System.out.println("The number A has more digits");
        if (countA < countB) System.out.println("The number B has more digits");
        if (countA == countB) System.out.println("Digits in this numbers are peer");
    }

    public static void task12(int k, int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            int number = i;
            int countSum = 0;
            while (number > 0) {
                countSum += number % 10;
                number = number / 10;

            }
            if (countSum == k) list.add(i);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();

    }

    public static void task13(int n) {
        int[] array = new int[n + 1];
        int count = 0;
        for (int i = n; i <= n * 2; i++) {
            array[count] = i;
            count++;
        }
        for (int i = 0; i < array.length - 2; i++) {
            if (checkNaturalNumber(array[i]) && checkNaturalNumber(array[i + 2])) {
                System.out.println(array[i] + "\t||\t" + array[i + 2]);
            }
        }
    }

    private static boolean checkNaturalNumber(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        return bigInteger.isProbablePrime((int) Math.log(n));
    }

    public static void task14(int k) {

        for (int i = 1; i <= k; i++) {
            int[] array;
            int quantity = checkQuantityDigitsNumber(i);
            array = task10(i);
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += Math.pow(array[j], quantity);
            }
            if (sum == i) {
                System.out.printf("Number %d is Armstrong's number\n", i);
            }
        }
    }

    private static int checkQuantityDigitsNumber(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int[] buildArrayNumbers(int n) {
        int[] array = new int[maxCategory(n) - minCategory(n) + 1];
        int min = minCategory(n);
        int max = maxCategory(n);
        for (int i = min; i <= max; i++) {
            array[i - min] = i;
        }
        return array;
    }

    public static void task15(int n) {
        int[] array = buildArrayNumbers(n);
        for (int i = 0; i < array.length; i++) {
            if (chekRiseArray(task10(array[i]))) {
                System.out.println(array[i]);
            }
        }
    }

    private static int minCategory(int n) {
        return (int) ((int) 1 * Math.pow(10, n - 1));
    }

    private static int maxCategory(int n) {
        return (int) ((int) 1 * Math.pow(10, n) - 1);
    }

    private static boolean chekRiseArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) return false;
        }
        return true;
    }

    public static void task16(int n) {
        int[] array = buildArrayNumbers(n);
        long sum = amountOddNumbers(array);
        System.out.println(sum);
        int[] arrayNumberSum = task10((int) sum);
        int countEvenNumbers = 0;
        for (int i = 0; i < arrayNumberSum.length; i++) {
            if (arrayNumberSum[i] % 2 == 0) countEvenNumbers++;
        }
        System.out.printf("The sum contains %d even numbers\n", countEvenNumbers);
    }

    private static long amountOddNumbers(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (!chekOddNumbers(array[i])) sum += array[i];
        }
        return sum;

    }

    private static boolean chekOddNumbers(int n) {
        int[] array = task10(n);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void task17(int n) {
        int number = n;
        int count = 0;
        while (number>0){
            number = number - sumNumber(number);
            count++;
        }
        System.out.println("You must deduct\t"+count+"\ttimes sum digital from number\t"+n+"\tto complete zero");

    }

    private static int sumNumber(int n) {
        int[] array = task10(n);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
