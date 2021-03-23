package supporting;

import models.Article;
import models.Product;
import service.Shop;
import service.StockRoom;

import java.util.LinkedList;
import java.util.TreeSet;

public class Sort {
    public static void sortPriseIncrease(Shop shop) {
        ProductComparatorIncrease productComparator = new ProductComparatorIncrease();
        TreeSet<Article> articles = new TreeSet<>(productComparator);
        articles.addAll(shop.getArticleMap().values());
        for (Article a : articles) {
            System.out.printf("Name - %s, Price - %d, Id - %d\n", a.getName(), a.getPrice(), a.getId());
        }
    }

    public static void sortPriseDecrease(Shop shop) {
        ProductComparatorDecrease productComparator = new ProductComparatorDecrease();
        TreeSet<Article> articles = new TreeSet<>(productComparator);
        articles.addAll(shop.getArticleMap().values());
        for (Article a : articles) {
            System.out.printf("Name - %s, Price - %d, Id - %d\n", a.getName(), a.getPrice(), a.getId());
        }
    }

    public static void sortTimeOfAddition(Shop shop) {
        LinkedList<Article> list = new LinkedList<>(shop.getArticleMap().values());
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("Name - %s, Price - %d, Id - %d\n", list.get(i).getName(),
                    list.get(i).getPrice(), list.get(i).getId());
        }
    }

    public static void sortPriseDecrease(StockRoom stockRoom) {
        ProductComparatorDecrease productComparator = new ProductComparatorDecrease();
        TreeSet<Product> products = new TreeSet<>(productComparator);
        products.addAll(stockRoom.getStockMap().values());
        for (Product p : products) {
            System.out.printf("Name - %s, Price - %d, Amount - %d, Id - %d\n", p.getName(), p.getPrice(), p.getAmount(), p.getId());
        }
    }

    public static void sortPriseIncrease(StockRoom stockRoom) {
        ProductComparatorIncrease productComparator = new ProductComparatorIncrease();
        TreeSet<Product> products = new TreeSet<>(productComparator);
        products.addAll(stockRoom.getStockMap().values());
        for (Product p : products) {
            System.out.printf("Name - %s, Price - %d, Amount - %d, Id - %d\n", p.getName(), p.getPrice(), p.getAmount(), p.getId());
        }
    }

    public static void sortTimeOfAddition(StockRoom stockRoom) {
        LinkedList<Product> list = new LinkedList<>(stockRoom.getStockMap().values());
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("Name - %s, Price - %d, Amount - %d, Id - %d\n", list.get(i).getName(),
                    list.get(i).getPrice(), list.get(i).getAmount(), list.get(i).getId());
        }
    }
}
