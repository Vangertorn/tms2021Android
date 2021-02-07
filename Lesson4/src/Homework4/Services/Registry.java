package Homework4.Services;

import Homework4.Model.Address;
import Homework4.Model.Person;

import java.util.LinkedList;
import java.util.List;

public class Registry {

    private Person[] citizen;

    public Registry(Person[] citizen) {
        this.citizen = citizen;
    }

    public List<Person> getPeople(Address address) {
        List<Person> people = new LinkedList<>();
        for (Person p : citizen) {
            Address personsAddress = p.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())) {
                people.add(p);
            }
        }
        return people;

    }

    public Person[] getCitizen() {
        return citizen;
    }

    public void setCitizen(Person[] citizen) {
        this.citizen = citizen;
    }
}
