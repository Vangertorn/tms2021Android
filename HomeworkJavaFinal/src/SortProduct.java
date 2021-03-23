import java.util.LinkedList;
import java.util.TreeSet;

public class SortProduct {
    public static void sortPrise(Shop shop) {
        ProductComparator productComparator = new ProductComparator();
        TreeSet<Product> products = new TreeSet<>(productComparator);
        products.addAll(shop.getList());
        for (Product p : products) {
            System.out.println(p.getName() + "\t" + p.getPrice());
        }
    }

    public static void sortTimeOfAddition(Shop shop) {
        LinkedList<Product> list = new LinkedList<>();
        list.addAll(shop.getList());
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i).getName());
        }
    }
}
