public class Product extends Article {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product() {

    }

    public Product(int id) {
        this.setId(id);
    }

    public Product(int id, String name, String type, int price, int amount) {
        super(id, name, type, price);
        this.amount = amount;
    }
}
