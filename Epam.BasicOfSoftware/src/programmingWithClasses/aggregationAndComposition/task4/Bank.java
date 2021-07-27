package programmingWithClasses.aggregationAndComposition.task4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Bank {
    private LinkedHashMap<Integer, Consumer> consumers;

    public Bank() {
        this.consumers = new LinkedHashMap<>();
    }

    public void addConsumer(Consumer consumer) {
        if (consumers.containsKey(consumer.getId())) {
            System.out.println("This consumer there is already");
        } else consumers.put(consumer.getId(), consumer);
    }

    public void searchAccountInfo(int idConsumer, int numberAccount) {
        if (consumers.containsKey(idConsumer)) {
            if (consumers.get(idConsumer).getAccounts().containsKey(numberAccount)) {
                Account account = consumers.get(idConsumer).getAccounts().get(numberAccount);
                System.out.println(account.toString());
            } else System.out.println("This account didn't found");
        } else System.out.println("This consumer didn't found");
    }

    public Account searchAccount(int idConsumer, int numberAccount) {
        if (consumers.containsKey(idConsumer)) {
            if (consumers.get(idConsumer).getAccounts().containsKey(numberAccount)) {
                Account account = consumers.get(idConsumer).getAccounts().get(numberAccount);
                return account;
            } else System.out.println("This account didn't found");
        } else System.out.println("This consumer didn't found");
        return null;
    }

    public void amountPersonMoney(int idConsumer) {
        int sum = 0;
        if (consumers.containsKey(idConsumer)) {
            for (Account account : consumers.get(idConsumer).getAccounts().values()) {
                sum += account.getAmount();
            }
            System.out.println("Consumer " + consumers.get(idConsumer).getName() + " has " + sum);
        }
    }

    public void amountPositiveAccount(int idConsumer) {
        int sum = 0;
        if (consumers.containsKey(idConsumer)) {
            for (Account account : consumers.get(idConsumer).getAccounts().values()) {
                if (account.count)
                    sum += account.getAmount();
            }
            System.out.println("Consumer " + consumers.get(idConsumer).getName() + " has " + sum + " on positive accounts");
        }
    }

    public void amountNegativeAccount(int idConsumer) {
        int sum = 0;
        if (consumers.containsKey(idConsumer)) {
            for (Account account : consumers.get(idConsumer).getAccounts().values()) {
                if (!account.count)
                    sum += account.getAmount();
            }
            System.out.println("Consumer " + consumers.get(idConsumer).getName() + " has " + sum + " on negative accounts");
        }
    }
}
