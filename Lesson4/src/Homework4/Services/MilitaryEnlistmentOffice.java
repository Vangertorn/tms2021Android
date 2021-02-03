package Homework4.Services;

import Homework4.Model.Address;
import Homework4.Model.Person;


import java.util.LinkedList;
import java.util.List;

public class MilitaryEnlistmentOffice {
    private Registry registry;

    public MilitaryEnlistmentOffice(Registry registry) {
        this.registry = registry;
    }

    public List<Person> getPeople(Address address) {
        List<Person> conscripts = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : conscripts) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("men")) {
                fitPeople.add(person);
            }
        }
        return fitPeople;
    }

}
