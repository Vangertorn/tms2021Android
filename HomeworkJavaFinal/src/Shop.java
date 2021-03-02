import java.util.*;

public class Shop {
    private LinkedHashSet list;
    private static int numberShop;


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
        list = new LinkedHashSet<Article>();
        numberShop++;
    }

    public void addProduct(Article article) {
        if (!list.add(article)) {
            System.out.println(article.getName() + "\tThis article already here");
        }
    }

    public void addProduct() {
        ReaderArticle readerArticle = new ReaderArticle();

        if (!list.add(readerArticle.reader())) {
            System.out.println(readerArticle.reader().getName() + "\tThis article already here");
        }
    }

    public LinkedHashSet<Article> getList() {
        return list;
    }

    public void deleteProduct(int id) {
        boolean b = true;
        for (Article p : getList()) {
            if (p.getId() == id) {
                getList().remove(p);
                System.out.println(p.getName() + "\t" + p.getId() + "\t delete from shop" + numberShop);
                b = false;
            }
        }
        if (b) {
            System.out.println("Article with id\t" + id + "\t isn't in this shop ");
        }
    }

    public void info() {
        for (Article i : getList()) {
            System.out.println(i.getName());
        }
    }

    public void editArticle(int id) {
        if (getList().contains(new Article(id))) {
            Article a = (ReaderArticle.readerEdit(id));
            for (Article p : getList()) {
                if (p.getId() == a.getId()) {
                    p.setPrice(a.getPrice());
                    p.setName(a.getName());
                    p.setType(a.getName());
                    System.out.println("Edit completed");
                }
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            String answer;
            System.out.println("This article isn't in this shop. Would you like add it? " +
                    "Can You enter 1 if You want add it" +
                    " or 2 if You want add it please");
            answer = scanner.nextLine();
            if (answer.equals(1)) {
                ReaderArticle readerArticle = new ReaderArticle();
                list.add(readerArticle.reader());
            }
        }
    }

    public boolean byuArticle(int id, int number) {
        if (!getList().contains(new Article(id))) {
            System.out.println("Unfortunately this product is not available in our store");
            return true;
        }
        return false;
    }


    public static void shopNumber() {
        System.out.println("Now there is\t" + numberShop + "\tshop");
    }
}




