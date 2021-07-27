package basicOfOOP.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class MainTask2 {
    public static void main(String[] args) {
        Product product = new Product("Beer", 5);
        Product product1 = new Product("Vodka", 4);
        Product product2 = new Product("Sweet", 3);
        Payment payment = new Payment(new LinkedList<>(Arrays.asList(product,product1,product2)),1);
        payment.printChek();

    }
}
