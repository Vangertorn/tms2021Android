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
        if (checkComputer(this.condition, this.counter) == 0) {
            return;
        }
        Random random = new Random();
        int b = random.nextInt(2);
        //      It's string for wimps;
//                System.out.println(b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enable computer enter number 1 or 0 for enable");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
            this.counter++;
        } else {
            this.condition = 0;
        }
        checkComputer1(this.condition);
    }

    public void off() {
        if (checkComputer(this.condition, this.counter) == 0) {
            return;
        }
        Random random = new Random();
        int b = random.nextInt(2);
        //       It's string for wimps;
//                System.out.println(b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You turn off computer enter number 1 or 0 for off");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
            this.counter++;
        } else {
            this.condition = 0;
        }
        checkComputer1(this.condition);


    }

    private int checkComputer(int condition, int counter) {
        condition = this.condition;
        counter = this.counter;
        if (condition == 0 || counter >= this.limitCounter) {
            System.out.println("the computer burned down");
            return 0;
        }
        return 1;

    }

    private void checkComputer1(int condition) {
        condition = this.condition;
        if (condition == 0) {
            System.out.println("the computer burned down");
        }
    }


}
