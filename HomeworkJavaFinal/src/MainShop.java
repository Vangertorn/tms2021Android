import Models.Article;
import Service.Shop;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Article article1 = new Article(12, "BMV", "car", 10000);
        Article article2 = new Article(13, "Audi", "car", 12000);
        Article article3 = new Article(19, "Gili", "car", 8000);
        shop.addArticle(article1);
        shop.addArticle(article2);
        shop.addArticle(article3);
        Menu menuShop = new Menu(shop);
        menuShop.start();


    }
}
