import java.util.TreeSet;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product(12, "BMV", "car", 10000);
        Product product2 = new Product(13, "Audi", "car", 12000);
        Product product3 = new Product(19, "Gili", "car", 8000);
        shop.addShop(product1);
        shop.addShop(product2);
        shop.addShop(product3);
        SortProduct.sortPrise(shop);
        shop.deleteProduct(19);
        SortProduct.sortTimeOfAddition(shop);
        Product product4 = new Product(12, "Volvo", "car", 4000);
        shop.editProduct(product4);
        shop.info();


    }
}
