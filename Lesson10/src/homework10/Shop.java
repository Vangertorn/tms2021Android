package homework10;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private final List<CashRegister> allCashRegisterInShop;

    public Shop() {
        allCashRegisterInShop = new LinkedList<>();
    }

    public List<CashRegister> cratingAll() {
        CashRegister cashRegister = new CashRegister("Tamara", "Dollar", 5000);
        CashRegister cashRegister1 = new CashRegister("Sveta", "Euro", 3000);
        CashRegister cashRegister2 = new CashRegister("Galya", "Rub", 1000);
        CashRegister cashRegister3 = new CashRegister("Tanya", "Rub", 2000);
        allCashRegisterInShop.add(cashRegister);
        allCashRegisterInShop.add(cashRegister1);
        allCashRegisterInShop.add(cashRegister2);
        allCashRegisterInShop.add(cashRegister3);
        return allCashRegisterInShop;
    }
}
