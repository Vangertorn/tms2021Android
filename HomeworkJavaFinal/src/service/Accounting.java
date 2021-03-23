package service;

import models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Accounting {
    private final StockRoom stockRoom;
    private final HashMap<String, List<Product>> sortByType;

    protected Accounting(StockRoom stockRoom) {
        this.stockRoom = stockRoom;
        sortByType = new HashMap<>();
        for (Product product : stockRoom.getStockMap().values()) {
            if (!sortByType.containsKey(product.getType())) {
                sortByType.put(product.getType(), new ArrayList<>());
            }
            sortByType.get(product.getType()).add(product);
        }
    }

    protected int averageCostAll() {
        int costAll = 0;
        for (Product product : stockRoom.getStockMap().values()) {
            costAll += product.getPrice() * product.getAmount();
        }
        return costAll;
    }

    protected int averageCostType(String s) {
        int costType = 0;
        for (Product product : sortByType.get(s)) {
            costType += product.getPrice() * product.getAmount();
        }
        return costType;
    }

    protected double averagePriceAllShop() {
        double priceAll = 0;
        for (Product product : stockRoom.getStockMap().values()) {
            priceAll += priceAll + product.getPrice();
        }
        return priceAll / amountProductAll();
    }

    protected double averagePriceType(String s) {
        double priceType = 0;
        for (Product product : sortByType.get(s)) {
            priceType += product.getPrice();
        }
        return priceType / sortByType.get(s).size();
    }

    protected int amountProductAll() {
        int amountAll = 0;
        for (Product product : stockRoom.getStockMap().values()) {
            amountAll += product.getAmount();
        }
        return amountAll;
    }

    protected int typeProductAllAmount() {
        return sortByType.keySet().size();
    }

    protected List<String> typeProductAllName() {
        return new LinkedList<>(sortByType.keySet());
    }

    protected int amountProductType(String type) {
        int amount = 0;
        for (Product product : sortByType.get(type)) {
            amount += product.getAmount();
        }
        return amount;
    }

}
