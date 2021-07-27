package programmingWithClasses.aggregationAndComposition.task5;

public class TouristPackage {
    private static final int COST_ONE_DAY = 20;
    private static final int COST_TRANSPORT = 30;
    private static final int COST_ONE_MEAL = 5;
    private String type;
    private String transport;
    private int numberMeals;
    private double costType;
    private double costTransport;
    private double costMeals;
    private double costPackage;


    public TouristPackage(String type, String transport, int numberMeals) {
        this.type = type;
        this.transport = transport;
        this.numberMeals = numberMeals;
        calculationCostType();
        calculationCostTransport();
        calculationCostMeals();
        costPackage = calculationCostPackage();



    }
    private double  calculationCostPackage(){
        return costType+costMeals+costTransport;
    }

    private void calculationCostType() {
        switch (type) {
            case ("relax"):
                costType = COST_ONE_DAY * 5;
                break;
            case ("guided tours"):
                costType = COST_ONE_DAY * 4;
                break;
            case ("treatment"):
                costType = COST_ONE_DAY * 4.2;
                break;
            case ("shopping"):
                costType = COST_ONE_DAY * 2;
                break;
            case ("cruise"):
                costType = COST_ONE_DAY * 6;
                break;
        }
    }
    private void calculationCostTransport(){
        switch (transport) {
            case ("bus"):
                costTransport = COST_TRANSPORT * 3;
                break;
            case ("plane"):
                costTransport = COST_TRANSPORT * 5;
                break;
            case ("train"):
                costTransport = COST_TRANSPORT * 4;
        }
    }
    private void calculationCostMeals(){
        switch (numberMeals) {
            case (0):
                costMeals = COST_ONE_MEAL * 0;
            case (1):
                costMeals = COST_ONE_MEAL;
            case (2):
                costMeals = COST_ONE_MEAL * 2;
            case (3):
                costMeals = COST_ONE_MEAL * 3;

        }
    }

    @Override
    public String toString() {
        return "TouristPackage{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", numberMeals=" + numberMeals +
                ", costType=" + costType +
                ", costTransport=" + costTransport +
                ", costMeals=" + costMeals +
                ", costPackage=" + costPackage +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getTransport() {
        return transport;
    }

    public int getNumberMeals() {
        return numberMeals;
    }

    public double getCostType() {
        return costType;
    }

    public double getCostTransport() {
        return costTransport;
    }

    public double getCostMeals() {
        return costMeals;
    }

    public double getCostPackage() {
        return costPackage;
    }
}
