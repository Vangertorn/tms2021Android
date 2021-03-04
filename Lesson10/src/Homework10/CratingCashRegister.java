package Homework10;

import java.util.LinkedList;
import java.util.List;

public class CratingCashRegister {
    private final List<CashRegister> allCashRegister;

    public CratingCashRegister() {
        allCashRegister = new LinkedList<>();
    }

    public List<CashRegister> cratingAll() {
        CashRegister cashRegister = new CashRegister("Tamara", "Dollar", 5000);
        CashRegister cashRegister1 = new CashRegister("Sveta", "Euro", 3000);
        CashRegister cashRegister2 = new CashRegister("Galya", "Rub", 1000);
        CashRegister cashRegister3 = new CashRegister("Tanya", "Rub", 2000);
        allCashRegister.add(cashRegister);
        allCashRegister.add(cashRegister1);
        allCashRegister.add(cashRegister2);
        allCashRegister.add(cashRegister3);
        return allCashRegister;
    }
}
