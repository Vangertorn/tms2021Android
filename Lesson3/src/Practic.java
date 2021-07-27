import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(a^b);
        int num1 = 8;
        int num2 = 34;
        String result = num1>num2 ? "num1>num2" : "num1<num2";
        System.out.println(result);

        int[] array1 = {1, 2, 3, 4, 5, 3, 23, 123, 3212, 32, 22};
   //     System.out.println(array(array1));
        int[][] array2 = newarray(12,3);
        int [] array3 = new int[11];
    //    System.arraycopy(array1,0,array3,0,11);

        for (int i =0; i<array2.length; i++){
            for (int j=0; j<array2[i].length; j++){
                //System.out.print(array2[i][j]);
            }
        }

        countDevs(111);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int saiz = scanner.nextInt();
        int[] array = new int[saiz];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }


        System.out.println(Arrays.toString(array));
        // /**
        //   * Метод должен вернуть кол-во нечетных элементов в массиве array
        //   * <p>
        //   * Example1:
        //    * array = {1,2,3,4,5}
        //     * Должен вернуть 3
        //     * Example1:
        //    * array = {0,2,3,4}
        //   * Должен вернуть 1
        //    *
        //    */
        // public static int countOdd(int[] array) {
        //     for (int i = 0; i<array.length; i++){
        //          if (array[i] % 2 == 1
        //     }
//
        //    return 0;


        // }

        //     int a = scanner.nextInt();
        //   // int b = scanner.nextInt();
        //    int[][] array1 = new int[a][a];
        //   for (int i = 0; i < array1.length; i++) {
        //      for (int j = 0; j < array1[i].length; j++) {
        //          array1[i][j] = random.nextInt(100);
        //       }
        //      //   System.out.println(Arrays.toString(array1[i][j]));
        //  }
        // int sum = 0;
        //for (int i = 0; i < array1.length; i++) {
        //   sum = sum + array1[i][i];
        // }
        //System.out.println(sum);
    }
/**
 * На вход приходит число. Вывести в консоль фразу из разряда "_COUNT_ программистов", заменить _COUNT_ на count которое пришло, и заменить окончание "программистов"
 * на уместное с точки русского языка (1 программист, 10 программистов) и тд
 *
 */

public static void countDevs(int count) {

    int c = count % 10;

    if (c >= 5) {
        //System.out.println(count + " программистов");
        if (c == 1) {
            //System.out.println(count + " программист");
        }
    } else {
       // System.out.println(count + " програмиста");
        }



    }

    public static int[][] newarray (int A, int B){
    int [][] array = new int[A][B];
    int sum = 0;

    Random random = new Random();
    for (int i=0; i<array.length; i++){
        for (int j=0; j< array[i].length; j++){
            array[i][j] = random.nextInt(100);
            sum+= array[i][j];
        }


    }
    return array;


    }

    public  static int array(int[] array1){
    int sum = 0;
    for(int a :array1){
        sum+=a;
    }


    return sum;
    }


}
