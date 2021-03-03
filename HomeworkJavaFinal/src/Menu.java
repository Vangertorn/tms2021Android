

import Models.Product;
import Reader.*;
import Service.Shop;
import Service.StockRoom;
import Supporting.SortArticle;

import java.util.Scanner;

public class Menu {
    private Shop shop;
    private StockRoom stockRoom;
    private ReaderArticle readerArticle;

    public Menu(Shop shop) {
        this.shop = shop;
        StockRoom stockRoom = new StockRoom(shop);
        this.stockRoom = stockRoom;


    }

    public void start() {
        while (action(choiceAction())) {
        }
        System.out.println("Thank You that used our shop");
    }

    public int choiceAction() {
        System.out.println("Could You chose an action, please:\n" +
                "Press 1 - \"All article in this shop\"\n" +
                "Press 2 - \"Add article\"\n" +
                "Press 3 - \"Edit article\"\n" +
                "Press 4 - \"Add product to the stokeRoom \"\n" +
                "Press 5 - \"Deleted product to the stokeRoom \"\n" +
                "Press 6 - \"Buy product to the stokeRoom \"\n" +
                "Press 7 - \"Exit\"");
        Scanner scannerAction = new Scanner(System.in);
        int action = scannerAction.nextInt();
        return action;

    }

    public boolean action(int action) {
        switch (action) {
            case 1:
                sortingMethodProduct();
                return true;
            case 2:
                addArticleOrProduct();
                return true;
            case 3:
                shop.editArticle(ReaderId.reader());
                return true;
            case 4:
                stockRoom.addNumberProduct(ReaderId.reader());
                return true;
            case 5:
                deletedProductOrArticle();
                return true;
            case 6:
                int id = ReaderId.reader();
                int amount = ReaderAmount.reader();
                if (shop.buyArticle(id, amount)) {
                    if(!stockRoom.buyProduct(id,amount)){
                        System.out.println("Unfortunately we don't have this product now");
                    }
                }
                return true;
            case 7:
                return false;
        }
        if (action != 1 && action != 2 && action != 3 && action != 4)
            System.out.println("Incorrect selection, try again, please");
        return true;
    }

    private void sortingMethodProduct() {
        System.out.println("Could You chose an sorting method:");
        System.out.println("Press 1 - \"If You want sort product on prices\"\n" +
                "Press 2 - \"If You want sort product on time addition");
        Scanner scannerSorting = new Scanner(System.in);
        int enterSorting = scannerSorting.nextInt();
        if (enterSorting != 1 && enterSorting != 2) System.out.println("Incorrect selection, try again, please");
        switch (enterSorting) {
            case 1:
                SortArticle.sortPrise(shop);
                break;
            case 2:
                SortArticle.sortTimeOfAddition(shop);
                break;
        }
    }

    private void addArticleOrProduct() {
        Scanner scanner = new Scanner(System.in);
        boolean count = true;
        while (count) {
            System.out.println("If do You want to create article press - 1\n" +
                    "If do You want to create product press - 2\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ReaderArticle readerArticle = new ReaderArticle();
                    shop.addArticle(readerArticle.reader());
                    count = false;
                    break;
                case 2:
                    ReaderProduct readerProduct = new ReaderProduct();
                    stockRoom.addProduct(readerProduct.reader());
                    count = false;
                    break;
            }
            if (count) System.out.println("You entered incorrect choice, try again");
        }
    }
    private void deletedProductOrArticle() {

        boolean count = true;
        while (count) {
            System.out.println("If do You want to deleted article press - 1\n" +
                    "If do You want to deleted product press - 2\n");
            int choice = ReaderInt.readerInt();
            switch (choice) {
                case 1:
                    int id = ReaderId.reader();
                    shop.deletedArticleWithShop(id);
                    stockRoom.getList().remove(new Product(id));
                    count = false;
                    break;
                case 2:
                    stockRoom.deletedProductWithStock(ReaderId.reader());
                    count = false;
                    break;
            }
            if (count) System.out.println("You entered incorrect choice, try again");
        }
    }
}
