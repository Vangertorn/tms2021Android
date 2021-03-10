package service;

import reader.ReaderFromTerminal;
import supporting.DisplaySeparator;

public class AccountingMenu {
    private final ReaderFromTerminal reader = new ReaderFromTerminal();
    private final Accounting accounting;

    public AccountingMenu(StockRoom stockRoom) {
        accounting = new Accounting(stockRoom);
    }

    public void amountTypeProduct() {
        boolean count = true;
        while (count) {
            DisplaySeparator.display();
            System.out.println("If do You want receive:\n " +
                    "\tamount product types press - 1\n" +
                    "\tnames of all product types press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Our shop has\t" + accounting.typeProductAllAmount() + "\ttype product");
                    count = false;
                    break;
                case 2:
                    System.out.println("Our shop has below product:");
                    for (String s : accounting.typeProductAllName()) {
                        System.out.println(s);
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.err.println("You must choose 1 or 2, try again, please");
            }
        }
    }

    public void amountAllProduct() {
        boolean count = true;
        while (count) {
            DisplaySeparator.display();
            System.out.println("If do You want receive:\n " +
                    "\tamount product  all over the shop press - 1\n" +
                    "\tamount product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Our shop has\t" + accounting.amountProductAll() + "\t products");
                    count = false;
                    break;
                case 2:
                    System.out.println("Our shop has:");
                    for (String type : accounting.typeProductAllName()) {
                        System.out.println(type + "\t" + accounting.amountProductType(type));
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.err.println("You must choose 1 or 2 or 3, try again, please");
            }
        }
    }

    public void averagePrice() {
        boolean count = true;
        while (count) {
            DisplaySeparator.display();
            System.out.println("If do You want receive:\n " +
                    "\taverage price product  all over the shop press - 1\n" +
                    "\taverage price product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Average price product  all over the shop is\t" + accounting.averagePriceAllShop());
                    count = false;
                    break;
                case 2:
                    System.out.println("Average price product each by type is:");
                    for (String s : accounting.typeProductAllName()) {
                        System.out.println(s + "\t" + accounting.averagePriceType(s));
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.err.println("You must choose 1 or 2, try again, please");
            }
        }
    }

    public void averageCost() {
        boolean count = true;
        while (count) {
            DisplaySeparator.display();
            System.out.println("If do You want receive:\n " +
                    "\tcost product  all over the shop press - 1\n" +
                    "\tcost product by type press - 2");
            switch (reader.readerInt()) {
                case 1:
                    System.out.println("Cost product  all over the shop is\t" + accounting.averageCostAll());
                    count = false;
                    break;
                case 2:
                    System.out.println("Cost product each by type is:");
                    for (String s : accounting.typeProductAllName()) {
                        System.out.println(s + "\t" + accounting.averageCostType(s));
                    }
                    count = false;
                    break;
            }
            if (count) {
                System.err.println("You must choose 1 or 2, try again, please");
            }
        }
    }
}
