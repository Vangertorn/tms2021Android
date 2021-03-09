package models;

public class Article {
    private Integer id;
    private String name;
    private String type;
    private int price;

    public Article() {
    }

    public Article(Integer id, String name, String type, int price) {
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
        return this.id.equals(article.id);
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
