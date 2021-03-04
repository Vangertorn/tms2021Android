package Homework10;

public class CashRegister {
    private String name;
    private String currency;
    private int timeFor1Purchase;
    private Integer queueSize = 0;

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

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

    public void serveCustomer(Buyer buyer) {
        increaseQueSize();
        synchronized (this) {
            System.out.printf("%s started pass the cash register %s\n", buyer.getName(), name);
            try {
                Thread.sleep(timeFor1Purchase);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (queueSize) {
                queueSize--;
                System.out.printf("%s finish pass the cash register %s\n", buyer.getName(), name);
            }
        }
    }

    public int getTimeFor1Purchase() {
        return timeFor1Purchase;
    }

    public void setTimeFor1Purchase(int timeFor1Purchase) {
        this.timeFor1Purchase = timeFor1Purchase;
    }

    private void increaseQueSize() {
        synchronized (queueSize) {
            queueSize++;
            System.out.println("CashRegister\t" + name + "\tQueue increased to size\t" + queueSize);
        }
    }
}
