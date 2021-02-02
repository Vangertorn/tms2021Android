package Homeworck4_1;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int operational;
    private int drive;
    private int counter;
    private int condition = 1;

    public Computer(String processor, int operational, int drive) {
        this.processor = processor;
        this.operational = operational;
        this.drive = drive;

    }


    public void Info() {
        System.out.println("processor\t" + processor + "\noperational\t" + operational + "\ndrive\t" + drive + "\ncounter\n" + counter);
    }

    public void Enable() {
        this.counter++;
        if (this.condition == 0 || this.counter > 3) {
            this.counter--;
            System.out.println("the computer burned down");
            return;

        }

        Random random = new Random();
        int b = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enable computer enter number 1 or 0");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
        } else {
            this.condition = 0;
        }

    }

    public void Off() {
        Random random = new Random();
        int b = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You turn off computer enter number 1 or 0");
        int a = scanner.nextInt();
        if (a == b) {
            this.condition = 1;
        } else {
            this.condition = 0;
        }

    }


}
