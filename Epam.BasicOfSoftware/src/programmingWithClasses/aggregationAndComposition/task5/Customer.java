package programmingWithClasses.aggregationAndComposition.task5;

public class Customer {
    private String purposeOfTravel;
    private String name;
    private int amountOfMoney;

    public Customer(String purposeOfTravel, String name, int amountOfMoney) {
        this.purposeOfTravel = purposeOfTravel;
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public String getPurposeOfTravel() {
        return purposeOfTravel;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }
}
