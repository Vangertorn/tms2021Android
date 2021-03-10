package service;

import models.Article;
import models.Product;
import reader.ReaderArticle;
import reader.ReaderFromTerminal;
import supporting.DisplaySeparator;

import java.util.*;

public class Shop {
    private final LinkedHashMap<Integer, Article> articleMap;
    ReaderFromTerminal reader = new ReaderFromTerminal();


    public Shop() {
        articleMap = new LinkedHashMap<>();
    }

    public Shop(LinkedHashMap<Integer, Article> articleMap) {
        this.articleMap = articleMap;
    }

    public void addArticle(Product product) {
        if (!articleMap.containsValue(product)) {
            articleMap.put(product.getId(), product);
        } else {
            addArticle(product.getId());
        }
    }

    public boolean addArticle(Integer id) {
        if (!articleMap.containsKey(id)) {
            ReaderArticle readerArticle = new ReaderArticle();
            Article newArticle = readerArticle.reader(id);
            articleMap.put(newArticle.getId(), newArticle);
        } else {
            DisplaySeparator.display();
            System.out.println(articleMap.get(id).getName() + "\tThis article already here");
            System.out.println("Do You want edit it?\n" +
                    "If You want edit it press - 1\n" +
                    "If You want not edit it press - 2");
            boolean count = true;
            while (count) {
                switch (reader.readerInt()) {
                    case 1:
                        ReaderArticle readerArticle = new ReaderArticle();
                        editArticle(readerArticle.reader(id));
                        return true;
                    case 2:
                        count = false;
                        break;
                }
                if (count) System.err.println("You entered incorrect choice, try again");
            }
        }
        return false;
    }

    public LinkedHashMap<Integer, Article> getArticleMap() {
        return articleMap;
    }

    public void deletedArticleWithShop(Integer id) {
        boolean successful = true;
        while (successful) {
            if (articleMap.containsKey(id)) {
                articleMap.remove(id, articleMap.get(id));
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

    public void editArticle(Article article) {
        if (articleMap.containsValue(article)) {
            articleMap.put(article.getId(), article);
            System.out.println("Edit completed");
        }
    }

    public boolean buyArticle(Integer id) {
        if (articleMap.containsKey(id)) {
            return true;
        }
        DisplaySeparator.display();
        System.err.println("Unfortunately this product is not available in our store");
        return false;
    }

}




