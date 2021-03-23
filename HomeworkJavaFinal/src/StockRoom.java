import java.util.LinkedHashSet;
import java.util.Scanner;

public class StockRoom {
    private Shop shop;
    private LinkedHashSet<Product> list;

    public StockRoom(Shop shop) {
        this.shop = shop;
        list = new LinkedHashSet<>();
    }

    public void addNumberProduct(int id) {
        if (list.contains(new Article(id))) {
            System.out.println("Could You enter number product, please");
            Scanner scanner = new Scanner(System.in);
            for (Product p : list) {
                if (p.getId() == id) {
                    p.setAmount(p.getAmount() + scanner.nextInt());
                    System.out.println(p.getAmount());
                }
            }

        } else if (shop.getList().contains(new Article(id))) {
            for (Article a : shop.getList()) {
                if (a.getId() == id) {
                    ReaderProduct readerProduct = new ReaderProduct();
                    list.add(readerProduct.reader(a));
                }
            }
        } else {
            System.out.println("Could You have create new product?\n" +
                    "If YES - press 1\n" +
                    "If NO - press 2");


            boolean condition = true;
            while (condition) {
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                switch (answer) {
                    case 1:
                        ReaderProduct readerProduct = new ReaderProduct();
                        Product product = readerProduct.reader();
                        list.add(product);
                        shop.getList().add(product);
                        condition = false;
                        break;
                    case 2:
                        condition = false;
                        break;
                }
                if (condition) {
                    System.out.println("You must choose 1 or 2, try again, please");
                }
            }
        }
    }

    public void deletedProductWithStock(int id) {
        boolean successful = true;
        while (successful) {
            if (list.remove(new Article(id))) {
                System.out.println("Delete completed successful");
                successful = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("You entered incorrect id. Do You want to repeated it?\n" +
                        "If Yes then You can press: 1\n" +
                        "If Yes then You can press: 2");
                switch (scanner.nextInt()) {
                    case 1:
                        break;
                    case 2:
                        successful = false;
                }
            }
        }
    }

    public void byuProduct(int id, int number) {
        if (list.contains(new Product(id))) {
            for (Product p : list) {
                if (p.getId() == id) {
                    if (p.getAmount() <= number) {
                        p.setAmount(p.getAmount() - number);
                        System.out.println("Purchase completed successfully");
                    }
                }
            }
        }
    }


    public LinkedHashSet getList() {
        return list;
    }

    public void setList(LinkedHashSet list) {
        this.list = list;
    }
}
