package basicOfOOP.task2;

import java.util.LinkedList;

public class Payment {
    private LinkedList<Product> products;
    private LinkedList<ObjectForPayment> objectForPayments;
    private double sideDiscount;

    public Payment(LinkedList<Product> products, double sideDiscount) {
        this.products = products;
        this.sideDiscount = sideDiscount;
        objectForPayments = new LinkedList<>();
        for (int i = 0; i < products.size(); i++) {
            ObjectForPayment objectForPayment = new ObjectForPayment(products.get(i), sideDiscount);
            objectForPayments.add(objectForPayment);


        }
    }

    public void printChek() {
        double sum = 0;
        for (ObjectForPayment objectForPayment : objectForPayments) {
            double cost = objectForPayment.calculatePrice();
            if (cost == -1) System.out.println("Our shop doesn't sell " + objectForPayment.getName());
            else if (cost == -2) System.out.println("You entered incorrect amount product");
            else {
                sum += cost;
                System.out.println(objectForPayment.getName() + " " + objectForPayment.getAmount() + " " + objectForPayment.calculatePrice());
            }
        }
        System.out.println("Total is " + sum + "\n Thank You your purchase, come again");
    }


    public class ObjectForPayment extends Product {
        private double cost;
        private final double sideDiscount;

        public ObjectForPayment(Product product, double sideDiscount) {
            super(product.getName(), product.getAmount());
            switch (product.getName()) {
                case "Beer":
                    cost = 2;
                    break;
                case "Vodka":
                    cost = 3;
                    break;
                case "Wine":
                    cost = 4;
                default:
                    cost = 0;
            }
            this.sideDiscount = sideDiscount;
        }

        public double calculatePrice() {
            if (cost == 0) return -1;
            if (this.getAmount() <= 0) return -2;
            return cost * this.getAmount() * sideDiscount;
        }
    }
}

