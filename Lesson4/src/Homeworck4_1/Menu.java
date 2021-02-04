package Homeworck4_1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Computer computer1 = new Computer("pent", 256, 10);
        System.out.print("How many time enable and off computer?\t");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        for (int i = 0; i < b; i++) {
            computer1.enable();
            computer1.off();
        }
        computer1.info();
    }
}
