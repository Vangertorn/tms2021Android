package Homework10;

import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        CratingCashRegister cashRegister = new CratingCashRegister();
        List allCash = cashRegister.cratingAll();
        for (int i = 0; i < 10; i++) {
            Buyer buyer = new Buyer("Buyer" + i, allCash, Buyer.choiceCurrency());
            buyer.start();
        }
    }
}
