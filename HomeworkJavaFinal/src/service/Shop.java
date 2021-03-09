package service;

import models.Article;
import reader.ReaderArticle;
import reader.ReaderFromTerminal;

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

    public void addArticle(Article article) {
        if (!articleMap.containsValue(article)) {
            articleMap.put(article.getId(), article);
        } else {
            System.out.println(article.getName() + "\tThis article already here");
            System.out.println("Do You want edit it?\n" +
                    "If You want edit it press - 1\n" +
                    "If You want not edit it press - 2\n");
            boolean count = true;
            while (count) {
                switch (reader.readerInt()) {
                    case 1:
                        editArticle(article.getId());
                        count = false;
                        break;
                    case 2:
                        count = false;
                        break;
                }
                if (count) System.out.println("You entered incorrect choice, try again");
            }
        }
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

    public void editArticle(int id) {
        if (articleMap.containsKey(id)) {
            Article a = new ReaderArticle().readerEdit(id);
            articleMap.put(id, a);
            System.out.println("Edit completed");
        } else {
            System.out.println("This article isn't in this shop. Would you like add it? " +
                    "Can You enter 1 if You want add it" +
                    " or 2 if You want add it please");
            if (reader.readerInt() == 1) {
                ReaderArticle readerArticle = new ReaderArticle();
                Article a = readerArticle.reader();
                articleMap.put(a.getId(), a);
            }
        }
    }

    public boolean buyArticle(Integer id) {
        if (articleMap.containsKey(id)) {
            return true;
        }
        System.out.println("Unfortunately this product is not available in our store");
        return false;
    }
}




