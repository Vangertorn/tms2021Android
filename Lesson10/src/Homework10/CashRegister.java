package Homework10;

public class CashRegister {
    private String name;
    private String currency;
    private int timeFor1Purchase;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CashRegister(String name, String currency, int timeFor1Purchase) {
        this.name = name;
        this.currency = currency;
        this.timeFor1Purchase = timeFor1Purchase;
    }

    public boolean serveCustomer(String buyerName) {
        System.out.printf("%s started pass the cash register %s\n", buyerName, name);
        System.out.printf("%s finish pass the cash register %s\n", buyerName, name);
        return false;
    }

    public int getTimeFor1Purchase() {
        return timeFor1Purchase;
    }

    public void setTimeFor1Purchase(int timeFor1Purchase) {
        this.timeFor1Purchase = timeFor1Purchase;
    }
}
