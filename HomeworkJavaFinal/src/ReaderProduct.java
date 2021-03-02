import java.util.Scanner;

public class ReaderProduct {
    public Product reader() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter id new product,please");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Could You enter name new product,please");
        String name = scanner.nextLine();
        System.out.println("Could You enter type new product,please");
        String type = scanner.nextLine();
        System.out.println("Could You enter price new product,please");
        int price = scanner.nextInt();
        System.out.println("Could You enter amount new product,please");
        int amount = scanner.nextInt();
        product.setId(id);
        product.setName(name);
        product.setType(type);
        product.setPrice(price);
        product.setAmount(amount);
        return product;
    }

    public Product reader(Article article) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter amount new product,please");
        int amount = scanner.nextInt();
        product.setId(article.getId());
        product.setName(article.getName());
        product.setType(article.getType());
        product.setPrice(article.getPrice());
        product.setAmount(amount);
        return product;
    }
}
