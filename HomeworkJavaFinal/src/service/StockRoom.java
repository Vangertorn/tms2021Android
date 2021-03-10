package service;

import models.Article;
import models.Product;
import reader.ReaderFromTerminal;
import reader.ReaderProduct;
import supporting.DisplaySeparator;

import java.util.LinkedHashMap;

public class StockRoom {
    private Shop shop;


    private LinkedHashMap<Integer, Product> stockMap;
    ReaderFromTerminal reader = new ReaderFromTerminal();

    public StockRoom() {
    }

    public StockRoom(Shop shop, LinkedHashMap<Integer, Product> stockMap) {
        this.shop = shop;
        this.stockMap = stockMap;
    }

    public void editProduct(Article article) {
        if (stockMap.containsKey(article.getId())) {
            stockMap.get(article.getId()).setName(article.getName());
            stockMap.get(article.getId()).setType(article.getType());
            stockMap.get(article.getId()).setPrice(article.getPrice());
        } else {
            System.err.println(article.getName() + "\t This article isn't in stockRoom");

        }
    }

    public void editProduct(Product product) {
        if (stockMap.containsKey(product.getId())) {
            stockMap.get(product.getId()).setName(product.getName());
            stockMap.get(product.getId()).setType(product.getType());
            stockMap.get(product.getId()).setPrice(product.getPrice());
            stockMap.get(product.getId()).setAmount(product.getAmount());
        } else {
            System.err.println(product.getName() + "\t This article isn't in stockRoom");

        }
    }

    public void addProduct(Integer id) {
        if (stockMap.containsKey(id)) {
            DisplaySeparator.display();
            System.out.println(stockMap.get(id).getName() + "\tThis product already here");
            System.out.println("Do You want edit it?\n" +
                    "If YES - press 1\n" +
                    "If NO - press 2");
            boolean count = true;
            while (count) {
                switch (reader.readerInt()) {
                    case 1:
                        ReaderProduct readerProduct = new ReaderProduct();
                        Product product = readerProduct.reader();
                        editProduct(product);
                        shop.editArticle(product);
                        count = false;
                        break;
                    case 2:
                        count = false;
                        break;
                }
                if (count) System.err.println("You must choose 1 or 2, try again, please");
            }
        } else if (shop.getArticleMap().containsKey(id)) {
            addNumberProduct(id);
        } else {
            ReaderProduct readerProduct = new ReaderProduct();
            Product product = readerProduct.reader(id);
            createNewProduct(product);
        }
    }

    public void addNumberProduct(Integer id) {
        if (stockMap.containsKey(id)) {
            DisplaySeparator.display();
            System.out.println("Could You enter number product, please");
            stockMap.get(id).setAmount(stockMap.get(id).getAmount() + reader.readerInt());
        } else if (shop.getArticleMap().containsKey(id)) {
            ReaderProduct readerProduct = new ReaderProduct();
            stockMap.put(id, readerProduct.reader(shop.getArticleMap().get(id)));
        } else {
            DisplaySeparator.display();
            System.out.println("Could You have create new product?\n" +
                    "If YES - press 1\n" +
                    "If NO - press 2");
            boolean count = true;
            while (count) {
                switch (reader.readerInt()) {
                    case 1:
                        addProduct(reader.readerId());
                        count = false;
                        break;
                    case 2:
                        count = false;
                        break;
                }
                if (count) {
                    System.err.println("You must choose 1 or 2, try again, please");
                }
            }
        }
    }

    public void deletedProductWithStock(int id) {
        boolean successful = true;
        while (successful) {
            if (stockMap.containsKey(id)) {
                stockMap.remove(id, stockMap.get(id));
                System.out.println("Delete completed successful");
                successful = false;
            } else {
                DisplaySeparator.display();
                System.out.println("You entered incorrect id. Do You want to repeated it?\n" +
                        "If Yes then You can press: 1\n" +
                        "If No then You can press: 2");
                switch (reader.readerInt()) {
                    case 1:
                        break;
                    case 2:
                        successful = false;
                }
            }
        }
    }

    public boolean buyProduct(int id, int amount) {
        if (stockMap.containsKey(id)) {
            if (stockMap.get(id).getAmount() >= amount) {
                stockMap.get(id).setAmount(stockMap.get(id).getAmount() - amount);
                System.out.println("Purchase completed successfully");
                return true;
            } else {
                DisplaySeparator.display();
                System.out.println("Unfortunately we don't have as much amount product now.\n" +
                        "You could buy max\t" + stockMap.get(id).getAmount() + "\t product unit\n" +
                        "If You want to buy everything press: 1\n" +
                        "If You want to exit press: 2");
                while (true) {
                    switch (reader.readerInt()) {
                        case 1:
                            stockMap.get(id).setAmount(0);
                            return true;
                        case 2:
                            return true;
                    }
                    System.err.println("You must choose 1 or 2, try again, please");
                }
            }
        }
        return false;
    }

    private void createNewProduct(Product product) {
        stockMap.put(product.getId(), product);
        shop.addArticle(product);
    }

    public LinkedHashMap<Integer, Product> getStockMap() {
        return stockMap;
    }
}
