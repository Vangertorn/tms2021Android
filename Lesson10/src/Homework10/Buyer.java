package Homework10;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Buyer extends Thread {
    private int age;
    private boolean gender;
    private String address;
    private int averageBill;
    private List historyPurchase;
    private LinkedHashSet basket;
    private List<CashRegister> cashRegisters;
    private String currency;


    public Buyer(String name, List<CashRegister> cashRegisters, String currency) {
        super(name);
        this.cashRegisters = cashRegisters;
        this.currency = currency;
    }

    @Override
    public void run() {

        synchronized (choiceCashRegister()) {
            choiceCashRegister().serveCustomer(getName());
            try {
                Thread.sleep(choiceCashRegister().getTimeFor1Purchase());
            } catch (InterruptedException e) {
                System.out.println("This tread broken");
            }
        }
    }

    private CashRegister choiceCashRegister() {
        boolean choice = true;
        Random random = new Random();
        List<CashRegister> similarCashRegister = new LinkedList<>();
        for (CashRegister i : cashRegisters) {
            if (i.getCurrency().equals(currency)) {
                similarCashRegister.add(i);
                choice = false;
            }
        }
        if (choice) {
            System.out.println(getName() + "\tWe don't use this currency,  You could use our ATM");
            return null;
        }
        return similarCashRegister.get(random.nextInt(similarCashRegister.size()));
    }

    public static String choiceCurrency() {
        String[] currencyAll = {"Dollar", "Euro", "Rub"};
        Random random = new Random();
        int choice = random.nextInt(currencyAll.length);
        return currencyAll[choice];
    }
}
