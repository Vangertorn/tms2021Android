package service;

import models.Product;
import reader.ReaderFromTerminal;

import java.util.*;

public class Accounting {
    private final StockRoom stockRoom;
    private final HashMap<String, List<Product>> sortByType;
    ReaderFromTerminal reader = new ReaderFromTerminal();

    public Accounting(StockRoom stockRoom) {
        this.stockRoom = stockRoom;
        sortByType = new HashMap<>();
        for (Product s : stockRoom.getStockMap().values()) {
            if (sortByType.containsKey(s.getType())) {
                sortByType.get(s.getType()).add(s);
            } else {
                sortByType.put(s.getType(), new ArrayList<>());
            }
        }
    }

    public void amountTypeProduct() {
        boolean count = true;
        while (count) {
            System.out.println("If do You want receive:\n " +
                    "\tamount product types press - 1\n" +
                    "\tnames of all product types press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Our shop has\t" + sortByType.keySet().size() + "\ttype product");
                    count = false;
                    break;
                case 2:
                    System.out.println("Our shop has below product:");
                    for (String s : sortByType.keySet()) {
                        System.out.println(s);
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.out.println("You must choose 1 or 2 or 3, try again, please");
            }
        }
    }

    public void amountAllProduct() {
        boolean count = true;
        while (count) {
            System.out.println("If do You want receive:\n " +
                    "\tamount product  all over the shop press - 1\n" +
                    "\tamount product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Our shop has\t" + stockRoom.getStockMap().size() + "\t products");
                    count = false;
                    break;
                case 2:
                    System.out.println("Our shop has:");
                    for (String s : sortByType.keySet()) {
                        System.out.println(s + "\t" + sortByType.get(s).size());
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.out.println("You must choose 1 or 2 or 3, try again, please");
            }
        }
    }

    public void averagePrice() {
        boolean count = true;
        while (count) {
            System.out.println("If do You want receive:\n " +
                    "\taverage price product  all over the shop press - 1\n" +
                    "\taverage price product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Average price product  all over the shop is\t" + averagePriceAllShop());
                    count = false;
                    break;
                case 2:
                    System.out.println("Average price product each by type is:");
                    for (String s : sortByType.keySet()) {
                        System.out.println(s + "\t" + averagePriceType(s));
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.out.println("You must choose 1 or 2, try again, please");
            }
        }
    }

    public void averageCost() {
        boolean count = true;
        while (count) {
            System.out.println("If do You want receive:\n " +
                    "\tcost product  all over the shop press - 1\n" +
                    "\tcost product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Cost product  all over the shop is\t" + averageCostAll());
                    count = false;
                    break;
                case 2:
                    System.out.println("Cost product each by type is:");
                    for (String s : sortByType.keySet()) {
                        System.out.println(s + "\t" + averageCostType(s));
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.out.println("You must choose 1 or 2, try again, please");
            }
        }
    }

    private int averageCostAll() {
        int costAll = 0;
        for (Product product : stockRoom.getStockMap().values()) {
            costAll += product.getPrice() * product.getAmount();
        }
        return costAll;
    }

    private int averageCostType(String s) {
        int costType = 0;
        for (Product product : sortByType.get(s)) {
            costType += product.getPrice() * product.getAmount();
        }
        return costType;
    }

    private double averagePriceAllShop() {
        double priceAll = 0;
        for (Product product : stockRoom.getStockMap().values()) {
            priceAll += priceAll + product.getPrice();
        }
        return priceAll / stockRoom.getStockMap().size();
    }

    private double averagePriceType(String s) {
        double priceType = 0;
        for (Product product : sortByType.get(s)) {
            priceType += product.getPrice();
        }
        return priceType / sortByType.get(s).size();
    }
}
