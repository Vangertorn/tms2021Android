package homework10;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private final List<CashRegister> allCashRegisterInShop;

    public Shop() {
        allCashRegisterInShop = new LinkedList<>();
    }

    public List<CashRegister> createAll() {
        allCashRegisterInShop.add(new CashRegister("Tamara", "Dollar", 5000));
        allCashRegisterInShop.add(new CashRegister("Sveta", "Euro", 3000));
        allCashRegisterInShop.add(new CashRegister("Galya", "Rub", 1000));
        allCashRegisterInShop.add(new CashRegister("Tanya", "Rub", 2000));
        return allCashRegisterInShop;
    }
}
