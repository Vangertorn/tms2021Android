import java.util.Scanner;

public class Practece {

//    private static int number = 12;
  // public static final String IMAGE_PATH = "tratatat";

    public static void main(String[] args) {
        System.out.println("Hello\nBack\tWorld     map");
        System.out.println("Hello \"World\"");
       int c,d,k;
        //double k;
        int num_111 = 0x6F; // number 111 16's systems
       int num_8 = 010; // number 8 8's systems
       int num13 = 0b1101; // number 13 2's systems
        float fl = 30.6f;
        double db = 30.6;
        char ch='c';
        System.out.println(ch);
        char ch1 = 'd';
        System.out.println(ch1);
        String ch3 = (String) (""+ch1 + ch);
        System.out.println(ch3);
        String hello="What";
        System.out.println(hello);

        final int num=10;
        //num=2;
        int a=5;
        byte b=(byte) a;
        double dou = 56.9898;
        //System.out.println(dou);
       // int j=(int) dou;
        //System.out.println(j);
       // j = (int) Math.round(dou);
       // System.out.println(j);
        int a1=3+4;
        int a2 = 10-7;
        int a3 = 10 * 6;
        double a4 = 14.0 / 5.0;
        double a5 = 14.0 % 5.0;
        int c1 = ++a1;
        System.out.println(c1);
        System.out.println(a1);
        int c2 = a2++;
        System.out.println(c2);
        System.out.println(a2);
        int c3 = --a3;
        double c4 = a4--;
        System.out.println(c4);
        System.out.println(a4);
        String hello1 = "привет";
        String hello2 = "пока";
        String hello3 = hello1 + hello2 + hello;
        System.out.println(hello3);
        int a11 = 6;
        int a12 = 4;
        System.out.println(a11&a12);
        int number = 45;
        int key = 102;
        int encrypt = number ^ key;
        int descrypt = encrypt ^ key;
        encrypt = 88;
        descrypt = encrypt ^ key;
        System.out.println(descrypt);
        System.out.println(~encrypt);
        System.out.println(a11==number);
        System.out.println(a11!=a12);
        boolean c8 = (5>6)||(4<3);
        System.out.println(c8);
        a11+=a12;
        System.out.println(a11);
        a11 = a11>>>a12;// What it is?
        System.out.println(a11);
        int [] nums;
        String  str [] = new String[10];
        nums = new int[20];
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //System.out.println(nums);
        int temper[] = {22,12,31,43,23,12,32,35,32,12,33};
        double avg;
        int sum = 0;
        int n = temper.length;
        for (int i = 0; i < n; i++) {
            sum = sum + temper[i];
        }
        System.out.println(sum);
        avg = (double) sum/n;
        System.out.println(avg);


        //for (int f : temper){
          //  sum += f;
        //}
        ///System.out.println(sum);
        for (int f = 0; f < temper.length; f++){
            sum += temper[f];
        }
        System.out.println(sum);
        int[][] nums3 = new int[10][10];
       // int[][] nums2 = {{0,1,2},{3,4,5}};
       // for (int i = 0; i < nums2);
        for (int i=0; i< nums3.length; i++)
        {
            for (int j=0; j < nums3[i].length; j++)
            {
                nums3[i][j]=1;
            }
        }
        System.out.println(nums3[9][9]);
       // System.out.println(nums3[10][10]);
        int x = 5;
        int x2 = 6;
        System.out.println("x="+x+";x2="+x2);
        String name = "Kostja";
        int age = 28;
        float height = 1.9f;
      // System.out.println("Имя: %s Возраст: %d лет Рост: %.2f метров\n", name, age, height); вызывает ошибки???
        Scanner in = new Scanner(System.in);
        int[] number1 = new int[5];
        for (int i=0; i < number1.length; i++){
            number1[i]=in.nextInt();
       }
        for (int i=0; i < number1.length; i++){
            System.out.print(number1[i]);
        }
        // System.out.println(number1[0]);// почему выводит сам массив и еще 1й элемент, а без квадратных скобок ничего не выводит





    }
 //       System.out.println();

    }

