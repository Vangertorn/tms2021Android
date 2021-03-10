package reader;

import models.Article;
import reader.interfaces.ReaderA;

import java.util.Locale;


public class ReaderArticle implements ReaderA {
    ReaderFromTerminal reader = new ReaderFromTerminal();

    @Override
    public Article reader() {
        Article article = new Article();
        int id = reader.readerId();
        while (id == 0) {
            id = reader.readerId();
        }
        System.out.println("Could You enter name new article,please");
        String name = reader.readerString();
        System.out.println("Could You enter type new article,please");
        String type = reader.readerString().trim().toLowerCase(Locale.ROOT);
        System.out.println("Could You enter price new article,please");
        int price = reader.readerInt();
        while (price <= 0) {
            System.out.println("Price can't be below zero, enter correct price new article,please");
            price = reader.readerInt();
        }
        article.setId(id);
        article.setName(name);
        article.setType(type);
        article.setPrice(price);
        return article;
    }

    public Article reader(Integer id) {
        Article article = new Article();
        System.out.println("Could You enter name new article,please");
        String name = reader.readerString();
        System.out.println("Could You enter type new article,please");
        String type = reader.readerString().trim().toLowerCase(Locale.ROOT);
        System.out.println("Could You enter price new article,please");
        int price = reader.readerInt();
        while (price <= 0) {
            price = reader.readerInt();
        }
        article.setId(id);
        article.setName(name);
        article.setType(type);
        article.setPrice(price);
        return article;
    }

    public Article readerEdit(Integer id) {
        Article article = new Article();
        System.out.println("Could You enter name edit article,please");
        String name = reader.readerString();
        System.out.println("Could You enter type edit article,please");
        String type = reader.readerString().trim().toLowerCase(Locale.ROOT);
        System.out.println("Could You enter price edit article,please");
        int price = reader.readerInt();
        while (price <= 0) {
            price = reader.readerInt();
        }
        article.setId(id);
        article.setName(name);
        article.setType(type);
        article.setPrice(price);
        return article;
    }
}
