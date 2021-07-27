package programmingWithClasses.aggregationAndComposition.task5;

import java.util.Comparator;
import java.util.LinkedList;

public class TravelAgency {
    private Customer customer;
    private LinkedList<TouristPackage> touristPackages;

    public TravelAgency(Customer customer) {
        this.customer = customer;
        touristPackages = new LinkedList<>();
    }

    public void addTouristPackage(TouristPackage touristPackage) {
        touristPackages.add(touristPackage);
    }

    public void purchaseTouristPackage(int number) {
        if (customer.getAmountOfMoney() > touristPackages.get(number).getCostPackage()) {
            System.out.println(customer.getName() + " bought " + touristPackages.get(number).toString());
        } else System.out.println("You have few money");
    }

    public void infoTouristPackageAll() {
        for (int i = 0; i< touristPackages.size();i++) {
            System.out.println( i + " " + touristPackages.get(i).toString());
        }
    }

    public void infoTouristPackageType(String typeTouristPackage) {
        for (TouristPackage touristPackage : touristPackages) {
            if (touristPackage.getType().equals(typeTouristPackage)) System.out.println(touristPackage.toString());
        }
    }

    public void sortPrice(int downOrUp) {
        if (downOrUp > 0) {
            touristPackages.sort(new Comparator<TouristPackage>() {
                @Override
                public int compare(TouristPackage o1, TouristPackage o2) {
                    if (o1.getCostPackage() - o2.getCostPackage() > 0)
                        return 1;
                    else if (o1.getCostPackage() - o2.getCostPackage() < 0)
                        return -1;
                    else return 0;
                }
            });
        }
        if (downOrUp < 0) {
            touristPackages.sort(new Comparator<TouristPackage>() {
                @Override
                public int compare(TouristPackage o1, TouristPackage o2) {
                    if (o2.getCostPackage() - o1.getCostPackage() > 0)
                        return 1;
                    else if (o2.getCostPackage() - o1.getCostPackage() < 0)
                        return -1;
                    else return 0;
                }
            });
        }


    }
}
