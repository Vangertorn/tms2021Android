import java.awt.*;
import java.util.*;
import java.util.List;

public class Shop {
    private LinkedHashSet list;
    private int numberShop;


    public void setList(LinkedHashSet list) {
        this.list = list;
    }

    public int getNumberShop() {
        return numberShop;
    }

    public void setNumberShop(int numberShop) {
        this.numberShop = numberShop;
    }

    public Shop() {
        list = new LinkedHashSet<Product>();
        numberShop++;
    }

    public void addShop(Product product) {
        if (!list.add(product)) {
            System.out.println(product.getName() + "\tThis product already here");
        }
    }

    public LinkedHashSet<Product> getList() {
        return list;
    }

    public void deleteProduct(int id) {
        boolean b = true;
        for (Product p : getList()) {
            if (p.getId() == id) {
                getList().remove(p);
                System.out.println(p.getName() + "\t" + p.getId() + "\t delete from shop" + numberShop);
                b = false;
            }
        }
        if (b) {
            System.out.println("Product with id\t" + id + "\t isn't in this shop ");
        }
    }

    public void info() {
        for (Product i : getList()) {
            System.out.println(i.getName());
        }
    }

    public void editProduct(Product product) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean matches = false;
        for (Product p : getList()) {
            if (p.getId() == product.getId()) {
                p.setPrice(product.getPrice());
                p.setName(product.getName());
                p.setType(product.getName());
                matches = true;
                System.out.println("Edit completed");
            }
        }
        if (!matches) {
            System.out.println("This product isn't in this shop. Would you like add it? Can You enter Yes or No, please");
            answer = scanner.nextLine();
            if (answer.equals("Yes")) {
                list.add(product);
            }
        }
    }
}




