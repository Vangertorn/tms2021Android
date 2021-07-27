package programmingWithClasses.theSimlestClasses.task8;

public class MainTask8 {
    public static void main(String[] args) {
        Customer customer = new Customer("Pupkin", "Vasiliy", "Petrovich", 75);
        Customer customer1 = new Customer("Loboda", "Svetlana", "Georgievna", 45);
        Customer customer2 = new Customer("Galkin", "Maksim", "Leonidovich", 69);
        Customer customer3 = new Customer("Kakashkin", "Igor", "Stepanovich", 68);
        Customer customer4 = new Customer("Lagovskaya", "Violetta", "Fedorovna", 31);
        Customer[] customers = new Customer[]{customer,customer1,customer2,customer3,customer4};
        CustomersOurBank customersOurBank = new CustomersOurBank(customers);
        customersOurBank.sortCustomer();
        customersOurBank.searchCustomersNumberCreditCard(60,80);
    }

}
