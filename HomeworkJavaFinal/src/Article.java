import java.util.Scanner;

public class Article {
    private int id;
    private String name;
    private String type;
    private int price;

    public Article(int id) {
        this.id = id;
    }

    public Article() {
    }

    public Article(int id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;

    }

    public int hashCode() {
        return this.id;
    }

    public boolean equals(Object o) {
        Article article = (Article) o;
        if (this.id == article.id) return true;
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("This price is not correct");
            this.price = -1;
        }
        this.price = price;
    }


}
