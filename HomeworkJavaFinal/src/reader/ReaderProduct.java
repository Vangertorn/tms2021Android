package reader;


import models.Article;
import models.Product;
import reader.interfaces.ReaderA;

public class ReaderProduct implements ReaderA {
    ReaderFromTerminal reader = new ReaderFromTerminal();

    public Product reader() {
        Product product = new Product();
        int id = reader.readerId();
        while (id == 0) {
            id = reader.readerId();
        }
        System.out.println("Could You enter name new product,please");
        String name = reader.readerString();
        System.out.println("Could You enter type new product,please");
        String type = reader.readerString();
        System.out.println("Could You enter price new product,please");
        int price = reader.readerInt();
        while (price <= 0) {
            price = reader.readerInt();
        }
        System.out.println("Could You enter amount new product,please");
        int amount = reader.readerInt();
        while (amount <= 0) {
            amount = reader.readerInt();
        }
        product.setId(id);
        product.setName(name);
        product.setType(type);
        product.setPrice(price);
        product.setAmount(amount);
        return product;
    }

    public Product reader(Article article) {
        Product product = new Product();
        System.out.println("Could You enter amount new product,please");
        int amount = reader.readerInt();
        while (amount <= 0) {
            amount = reader.readerInt();
        }
        product.setId(article.getId());
        product.setName(article.getName());
        product.setType(article.getType());
        product.setPrice(article.getPrice());
        product.setAmount(amount);
        return product;
    }
}
