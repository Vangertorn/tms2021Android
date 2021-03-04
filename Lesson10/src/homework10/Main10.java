package homework10;

import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        Shop Shop = new Shop();
        List allCash = Shop.cratingAll();
        for (int i = 0; i < 10; i++) {
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
