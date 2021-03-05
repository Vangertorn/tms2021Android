package homework10;

import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        Shop Shop = new Shop();
        List allCash = Shop.crateAll();
        Buyer buyer0 = new Buyer("Tolya",allCash,"Tugrik");
        buyer0.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 10; i++) {
            Buyer buyer = new Buyer("Buyer" + i, allCash, Buyer.choiceCurrency());
            buyer.start();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
