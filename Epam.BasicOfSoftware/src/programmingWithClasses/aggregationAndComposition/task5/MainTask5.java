package programmingWithClasses.aggregationAndComposition.task5;

public class MainTask5 {
    public static void main(String[] args) {
        Customer customer = new Customer("shopping","Maks",1000);
        TouristPackage touristPackage = new TouristPackage("shopping","bus",3);
        TouristPackage touristPackage1 = new TouristPackage("shopping","plane",3);
        TravelAgency travelAgency = new TravelAgency(customer);
        travelAgency.addTouristPackage(touristPackage);
        travelAgency.addTouristPackage(touristPackage1);
        travelAgency.infoTouristPackageAll();
        travelAgency.sortPrice(-2);
        travelAgency.purchaseTouristPackage(0);

    }
}
