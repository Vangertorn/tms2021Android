package programmingWithClasses.theSimlestClasses.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CustomersOurBank {
    private final ArrayList<Customer> arrayListCustomers;

    public CustomersOurBank(Customer[] customers) {
        arrayListCustomers = new ArrayList<>();
        this.arrayListCustomers.addAll(Arrays.asList(customers));
    }

    public void addCustomer(Customer customer) {
        arrayListCustomers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        arrayListCustomers.remove(customer);
    }

    public void sortCustomer() {
        arrayListCustomers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (!(o1.getSurname().equals(o2.getSurname()))) {
                    return o1.getSurname().compareTo(o2.getSurname());
                } else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getPatronymic().compareTo(o2.getPatronymic());
                }
            }
        });
        for (Customer customer : arrayListCustomers) {
            System.out.println(customer.toString());
        }
    }

    public void searchCustomersNumberCreditCard(int x, int y) {
        for (int i = x; i <= y; i++) {
            for (Customer customer : arrayListCustomers) {
                if (customer.getNumberCreditCard() == i) {
                    System.out.println(customer.toString());
                }
            }
        }
    }
}
