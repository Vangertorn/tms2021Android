package programmingWithClasses.aggregationAndComposition.task4;

public class Account {
    int number;
    int amount;
    boolean count;

    public Account(int number, int amount) {
        this.number = number;
        this.amount = amount;
        this.count = true;
    }

    public int getNumber() {
        return number;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", amount=" + amount +
                ", count=" + count +
                '}';
    }

    public void toUpCount(int amount) {
        this.amount += amount;
        System.out.println("Count " + number + " was replenished at" + amount);
    }

    public void withdraw(int amount) {
        if (count) {
            this.amount -= amount;
            System.out.println("You withdrew " + amount + ". Remains is " + this.amount);
            if (this.amount < 0) {
                count = false;
                System.out.println("Your account blocked");
            }
        } else System.out.println("Your account blocked. You owe our bank " + this.amount);

    }
}
