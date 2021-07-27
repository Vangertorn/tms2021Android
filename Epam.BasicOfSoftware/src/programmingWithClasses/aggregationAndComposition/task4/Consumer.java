package programmingWithClasses.aggregationAndComposition.task4;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Consumer {
    private String name;
    private int id;
    private LinkedHashMap<Integer, Account> accounts;

    public Consumer(String name, int id) {
        this.name = name;
        this.id = id;
        accounts = new LinkedHashMap<>();
    }

    public void addAccount(Account account) {
        if (accounts.containsKey(account.number)) {
            System.out.println("This account there is already");
        } else accounts.put(account.number, account);
    }

    public String getName() {
        return name;
    }

    public LinkedHashMap<Integer, Account> getAccounts() {
        return accounts;
    }

    public int getId() {
        return id;
    }
}
