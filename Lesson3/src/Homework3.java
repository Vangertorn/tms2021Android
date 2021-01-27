import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        foobar(6);
        foobar(10);
        foobar(15);
        foobar(1);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     * - if number is positive - increase it by 1
     * - if number is negative - decrease it by 2
     * - if number is equal to zero - replace it with 10
     * return number value after operation
     */
    public static int operation(int number) {
        int a = 0;
        if (number > 0) {
            a = ++number;
        } else if (number < 0) {
            a = number - 2;
        } else {
            a = 10;
        }
        return a;
    }

    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else {
            System.out.println("wrong number");
        }
    }

    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("READ a   ");
        int a = scanner.nextInt();
        System.out.print("READ b   ");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                if (array[i][j] % 3 == 0) {
                    System.out.print("+\t");
                } else if (array[i][j] % 7 == 0) {
                    System.out.print("-\t");
                } else {
                    System.out.print("*\t");
                }
            }
        }
        System.out.println();
        System.out.println();

    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {
      ///  int[] array = new int[1000];
        int number = 1000;
        int a;

        //System.out.print("2\t3\t");
        for (int i = 2; i < number; i++) {
           a = i;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    isPrime = false;
                    break;
                } else if (j + 1 <= Math.sqrt(a)) {
                    continue;
                }
            }
            if (isPrime == true){
                System.out.print(a + "\t");
            }
        }
    }
}
