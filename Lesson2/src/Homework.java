import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int a = 10;
        byte b = 20;
        int sum = a +b;
        System.out.println(sum);
        int Max = Integer.MAX_VALUE;
        long sum2 = (long) Max+Max;
        System.out.println(sum2);
        //        System.out.println(max(50, 49));
        int[] mass = {50,49};
        int max = mass[0];
        for (int i = 0; i<mass.length; i++){
            if (mass[i]>max) {max=mass[i];}
        }
        System.out.println(max);
//        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        int[] mass2 = {1,2,3,4,5};
        double avr = 0;
        int sum1= 0;
        for (int i = 0; i< mass2.length; i++){
            sum1 = sum1 + mass2[i];
        }
        avr = (double) sum1 / mass2.length;
        System.out.println(avr);
//        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        int[]mass3 = {1,2,3,4,5,100,99};
        double max1 = 0;
        for (int i=0; i<mass3.length; i=i+1){
            if (mass3[i]>max1) { max1 = mass3[i];
            }
        }
        System.out.println(max1);

//        System.out.println(calculateHypotenuse());
        int AB = 3;
        int BC = 4;
        double AC = Math.pow((Math.pow(AB,2)+Math.pow(BC,2)),0.5);
        System.out.println(AC);
        int [] array = {1,2,3,4,5,3,23,123,3212,32,22};
        System.out.println("Hypotenuse=" + calculateHypotenuse());
        System.out.println("SUM="+ sum(2000000000,2000000000));
        System.out.println("MAX=" + max(14,23));
        System.out.println("average = " + average(array));
        System.out.println("Max array = " + max(array));
    }

    public static int sum(int a, int b) {
        int sum = a+b;
        long suma = (long)a +b;
        int k = -1;
        if (suma > Integer.MAX_VALUE){
            return k;}
        else {
            return sum;
        }
    }

    public static int max(int a, int b) {
        if (a >= b){
            return a;}
        else {
            return b;}

    }

    public static double average(int[] array) {
        double avg=0.0;
        int sum1=0 ;
        for ( int i = 0; i<array.length; i++) {
            sum1= sum1+array[i];
        }
        avg = sum1/array.length;
        return avg;
    }

    public static int max(int[] array) {
        int max=0;
        for (int i=0; i<array.length; i++){
            if (max<=array[i]){max=array[i];}
        }
        return max;
    }

    public static double calculateHypotenuse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Katet1");
        double Katet1 = in.nextDouble();
        System.out.println("Input a Katet2");
        double Katet2 = in.nextDouble();
        double Hypotenuse = Math.pow((Math.pow(Katet1,2)+Math.pow(Katet2,2)), 0.5);
        return Hypotenuse;
    }

}
