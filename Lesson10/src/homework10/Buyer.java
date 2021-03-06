package homework10;

import homework10.Exception.NotCurrencyException;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Buyer extends Thread {
    private List<CashRegister> cashRegisters;
    private String currency;

    public Buyer(String name, List<CashRegister> cashRegisters, String currency) {
        super(name);
        this.cashRegisters = cashRegisters;
        this.currency = currency;
    }

    @Override
    public void run() {
        try {
            choiceCashRegister().serveCustomer(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private CashRegister choiceCashRegister() throws Exception {
        List<CashRegister> similarCashRegister = new LinkedList<>();
        for (CashRegister i : cashRegisters) {
            if (i.getCurrency().equals(currency)) {
                similarCashRegister.add(i);
            }
        }
        if (similarCashRegister.size() == 0) {
            throw new NotCurrencyException("\tWe don't use this currency,  You could use our ATM");
        }
        if (similarCashRegister.size() == 1) {
            return similarCashRegister.get(0);
        } else {
            int min = Integer.MAX_VALUE;
            CashRegister minCash = null;
            for (CashRegister cash : similarCashRegister) {
                if (cash.getQueueSize() < min) {
                    min = cash.getQueueSize();
                    minCash = cash;
                }
            }
            return minCash;
        }
    }

    public static String choiceCurrency() {
        String[] currencyAll = {"Dollar", "Euro", "Rub"};
        Random random = new Random();
        int choice = random.nextInt(currencyAll.length);
        return currencyAll[choice];
    }
}
