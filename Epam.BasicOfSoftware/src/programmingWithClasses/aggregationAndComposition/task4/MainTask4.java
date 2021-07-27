package programmingWithClasses.aggregationAndComposition.task4;

public class MainTask4 {
    public static void main(String[] args) {
        Consumer consumer = new Consumer("Pasha", 94);
        consumer.addAccount(new Account(12, 293));
        consumer.addAccount(new Account(13, 245));
        Bank bank = new Bank();
        bank.addConsumer(consumer);
        bank.searchAccount(94, 13).toUpCount(2324);
        bank.searchAccount(94, 13).withdraw(10000);
        bank.searchAccount(94, 13).withdraw(1);
        bank.amountPersonMoney(94);
        bank.amountPositiveAccount(94);
        bank.amountNegativeAccount(94);

    }
}
