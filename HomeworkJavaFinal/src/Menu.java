
import reader.*;
import service.Accounting;
import service.Shop;
import service.StockRoom;
import supporting.Sort;


public class Menu {
    private Shop shop;
    private StockRoom stockRoom;
    ReaderFromTerminal reader = new ReaderFromTerminal();

    public Menu() {
        ReaderFile readerFile = new ReaderFile();
        Shop shop = readerFile.readerShop();
        StockRoom stockRoom = readerFile.readerStockRoom();
        this.shop = new Shop(shop.getArticleMap());
        this.stockRoom = new StockRoom(shop, stockRoom.getStockMap());
    }

    public void start() {
        System.out.println("Hello, welcome to the shop \"Yankin and Co\"!");
        boolean count = true;
        while (count) {
            System.out.println("If You work in the shop press - 1\n" +
                    "If You are buyer press - 2");
            switch (reader.readerInt()) {
                case 1:
                    String passwordForShop = "1111";
                    System.out.println("You have to enter password, please");
                    if (reader.readerString().equals(passwordForShop)) {
                        while (actionWorker(choiceActionWorker())) {
                        }
                        count = false;
                    } else {
                        System.out.println("You entered incorrect password.");
                    }
                    break;
                case 2:
                    while (actionBuyer(choiceActionBuyer())) {
                    }
                    count = false;
                    break;
            }
        }
        WriterFile writer = new WriterFile();
        writer.writerShop(shop);
        writer.writerStockRoom(stockRoom);
        System.out.println("Thank You that used our shop");
    }

    private Integer choiceActionBuyer() {
        System.out.println("Could You chose an action, please:\n" +
                "Press 1 - \"All article or product in this shop\"\n" +
                "Press 2 - \"Buy product to the stokeRoom\"\n" +
                "Press 3 - \"Exit\"");
        return reader.readerInt();
    }

    private boolean actionBuyer(Integer action) {
        switch (action) {
            case 1:
                sortArticleOrProduct();
                return true;
            case 2:
                byuProduct();
                return true;
            case 3:
                return false;
        }
        System.out.println("Incorrect selection, try again, please");
        return true;
    }

    private Integer choiceActionWorker() {
        System.out.println("Could You chose an action, please:\n" +
                "Press 1 - \"All article or product in this shop\"\n" +
                "Press 2 - \"Add article\"\n" +
                "Press 3 - \"Edit article\"\n" +
                "Press 4 - \"Add product to the stokeRoom\"\n" +
                "Press 5 - \"Deleted product to the stokeRoom \"\n" +
                "Press 6 - \"Buy product to the stokeRoom\"\n" +
                "Press 7 - \"Enter in accounting\"\n" +
                "Press 8 - \"Exit\"");
        return reader.readerInt();
    }

    private boolean actionWorker(Integer action) {
        switch (action) {
            case 1:
                sortArticleOrProduct();
                return true;
            case 2:
                addArticleOrProduct();
                return true;
            case 3:
                shop.editArticle(reader.readerId());
                return true;
            case 4:
                stockRoom.addNumberProduct(reader.readerId());
                return true;
            case 5:
                deletedProductOrArticle();
                return true;
            case 6:
                byuProduct();
                return true;
            case 7:
                String passwordForAccounting = "1111";
                System.out.println("You try to enter in accounting. You have to enter password, please");
                if (reader.readerString().equals(passwordForAccounting)) {
                    enterInAccounting();
                } else {
                    System.out.println("You entered incorrect password");
                }
                return true;
            case 8:
                return false;
        }
        System.out.println("Incorrect selection, try again, please");
        return true;
    }

    private void sortingMethodArticle() {
        boolean count = true;
        while (count) {
            System.out.println("Could You chose an sorting method:");
            System.out.println("Press 1 - \"If You want sort article on prices\"\n" +
                    "Press 2 - \"If You want sort article on time addition\"");
            switch (reader.readerInt()) {
                case 1:
                    boolean count1 = true;
                    while (count1) {
                        System.out.println("Press 1 - \"If You want sort article on prices in ascending order\"\n" +
                                "Press 2 - \"If You want sort article on prices in descending order\"");
                        switch (reader.readerInt()) {
                            case 1:
                                Sort.sortPriseIncrease(shop);
                                count1 = false;
                                break;
                            case 2:
                                Sort.sortPriseDecrease(shop);
                                count1 = false;
                                break;
                        }
                        if (count1) System.out.println("Incorrect selection, try again, please");
                    }
                    count = false;
                    break;

                case 2:
                    Sort.sortTimeOfAddition(shop);
                    count = false;
                    break;
            }
            if (count) System.out.println("Incorrect selection, try again, please");
        }
    }

    private void sortingMethodProduct() {
        boolean count = true;
        while (count) {
            System.out.println("Could You chose an sorting method:");
            System.out.println("Press 1 - \"If You want sort product on prices\"\n" +
                    "Press 2 - \"If You want sort product on time addition\"");
            switch (reader.readerInt()) {
                case 1:
                    boolean count1 = true;
                    while (count1) {
                        System.out.println("Press 1 - \"If You want sort product on prices in ascending order\"\n" +
                                "Press 2 - \"If You want sort product on prices in descending order\"");
                        switch (reader.readerInt()) {
                            case 1:
                                Sort.sortPriseIncrease(stockRoom);
                                count1 = false;
                                break;
                            case 2:
                                Sort.sortPriseDecrease(stockRoom);
                                count1 = false;
                                break;
                        }
                        if (count1) System.out.println("Incorrect selection, try again, please");
                    }
                    count = false;
                    break;
                case 2:
                    Sort.sortTimeOfAddition(stockRoom);
                    count = false;
                    break;
            }
            if (count) System.out.println("Incorrect selection, try again, please");
        }
    }

    private void addArticleOrProduct() {
        boolean count = true;
        while (count) {
            System.out.println("If do You want to create article press - 1\n" +
                    "If do You want to create product press - 2");
            switch (reader.readerInt()) {
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
            switch (reader.readerInt()) {
                case 1:
                    Integer id = reader.readerId();
                    shop.deletedArticleWithShop(id);
                    stockRoom.getStockMap().remove(id, stockRoom.getStockMap().get(id));
                    count = false;
                    break;
                case 2:
                    stockRoom.deletedProductWithStock(reader.readerId());
                    count = false;
                    break;
            }
            if (count) System.out.println("You entered incorrect choice, try again");
        }
    }

    private void enterInAccounting() {
        Accounting accounting = new Accounting(stockRoom);
        boolean count = true;
        while (count) {
            System.out.println("If do You want receive product types press - 1\n" +
                    "If do You want receive product amount press - 2\n" +
                    "If do You want receive average price products  press - 3\n" +
                    "If do You want receive cost products press - 4\n" +
                    "If do You want Exit press - 5");
            switch (reader.readerInt()) {
                case 1:
                    accounting.amountTypeProduct();
                    break;
                case 2:
                    accounting.amountAllProduct();
                    break;
                case 3:
                    accounting.averagePrice();
                    break;
                case 4:
                    accounting.averageCost();
                    break;
                case 5:
                    count = false;
                    break;
            }
        }
    }

    private void byuProduct() {
        int id = reader.readerId();
        int amount = reader.readerAmount();
        if (shop.buyArticle(id)) {
            if (!stockRoom.buyProduct(id, amount)) {
                System.out.println("Unfortunately we don't have this product now");
            }
        }
    }

    private void sortArticleOrProduct() {
        boolean count = true;
        while (count) {
            System.out.println("If You want sort article press - 1\n" +
                    "If You want sort product press - 2");
            switch (reader.readerInt()) {
                case 1:
                    sortingMethodArticle();
                    count = false;
                    break;
                case 2:
                    sortingMethodProduct();
                    count = false;
                    break;
            }
            if (count) System.out.println("Incorrect selection, try again, please");
        }
    }
}
