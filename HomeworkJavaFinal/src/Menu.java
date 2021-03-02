import java.util.Scanner;

public class Menu {
    private Shop shop;
    private StockRoom stockRoom;

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
                "Press 5 - \"Exit\"");
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
                shop.addProduct();
                return true;
            case 3:
                shop.editArticle(ReaderId.reader());
                return true;
            case 4:
                stockRoom.addNumberProduct(ReaderId.reader());
                return true;
            case 5:
                stockRoom.deletedProductWithStock(ReaderId.reader());
                return true;
            case 7:
                int id = ReaderId.reader();
                int number = 2;
                if (shop.byuArticle(id, number)) {
                    stockRoom.byuProduct(id, number);
                }
            case 6:
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
}
