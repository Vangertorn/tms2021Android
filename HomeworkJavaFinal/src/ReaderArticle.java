import java.util.Scanner;

public class ReaderArticle implements Reader {
    @Override
    public Article reader() {
        Article article = new Article();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter id new article,please");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Could You enter name new article,please");
        String name = scanner.nextLine();
        System.out.println("Could You enter type new article,please");
        String type = scanner.nextLine();
        System.out.println("Could You enter price new article,please");
        int price = scanner.nextInt();
        article.setId(id);
        article.setName(name);
        article.setType(type);
        article.setPrice(price);
        return article;
    }

    public static Article readerEdit(int id) {
        Article article = new Article();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter name new article,please");
        String name = scanner.nextLine();
        System.out.println("Could You enter type new article,please");
        String type = scanner.nextLine();
        System.out.println("Could You enter price new article,please");
        int price = scanner.nextInt();
        article.setId(id);
        article.setName(name);
        article.setType(type);
        article.setPrice(price);
        return article;
    }
}
