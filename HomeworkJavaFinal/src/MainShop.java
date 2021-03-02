public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Shop shop1 = new Shop();
        Article article1 = new Article(12, "BMV", "car", 10000);
        Article article2 = new Article(13, "Audi", "car", 12000);
        Article article3 = new Article(19, "Gili", "car", 8000);
        shop.addProduct(article1);
        shop.addProduct(article2);
        shop.addProduct(article3);
        Menu menuShop = new Menu(shop);
        menuShop.start();


    }
}
