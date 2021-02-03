package Homeworck4_1;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int operational;
    private int drive;
    private int counter;
    private int condition = 1;
    private int limitCounter;

    public Computer(String processor, int operational, int drive) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter limited counter\t");
        this.limitCounter = a.nextInt();
        this.processor = processor;
        this.operational = operational;
        this.drive = drive;
    }

    public void info() {
        System.out.println("processor\t" + processor + "\noperational\t" + operational + "\ndrive\t" + drive + "\ncounter\t" + counter);
    }

    public void enable() {
        if (this.condition == 0 || this.counter >= this.limitCounter) {
            System.out.println("the computer burned down");
            return;
        }
        Random random = new Random();
        int b = random.nextInt(2);
        //      It's string for wimps;
//                System.out.println(b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enable computer enter number 1 or 0");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
            this.counter++;
        } else {
            this.condition = 0;
        }
        if (this.condition == 0) {

            System.out.println("the computer burned down");
            return;
        }
    }

    public void off() {
        if (this.condition == 0 || this.counter >= this.limitCounter) {
            System.out.println("the computer burned down");
            return;
        }
        Random random = new Random();
        int b = random.nextInt(2);
        //       It's string for wimps;
//                System.out.println(b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You turn off computer enter number 1 or 0");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
            this.counter++;
        } else {
            this.condition = 0;
        }
        if (this.condition == 0) {
            System.out.println("the computer burned down");
            return;
        }

    }


}
