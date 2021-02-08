package Homework4.Services;

import Homework4.Model.Address;
import Homework4.Model.Person;


import java.util.LinkedList;
import java.util.List;

public class MilitaryEnlistmentOffice {
    private Registry registry;
    MilitaryPart[] militaryPart;

    public MilitaryEnlistmentOffice(Registry registry) {
        this.registry = registry;
    }

    public MilitaryEnlistmentOffice(Registry registry, MilitaryPart[] militaryPart) {
        this.registry = registry;
        this.militaryPart = militaryPart;
    }

    public void getPeople(Address address) {
        List<Person> conscripts = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : conscripts) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("men")) {
                fitPeople.add(person);
            }
        }
        for (Person p : fitPeople) {
            for (int i = 0; i < militaryPart.length; i++) {
                if (militaryPart[i].freeSpace() != 0) {
                    militaryPart[i].newSoldier(p);

                    break;

                }

                if (i == militaryPart.length - 1) {

                    System.out.println("Go away\t" + p.getName() + "\tWe don't need you");
                }

            }


        }
    }

    public int freePlays() {
        int freePlays = 0;
        for (int i = 0; i < militaryPart.length; i++) {

            freePlays = freePlays + militaryPart[i].freeSpace();

        }

        return freePlays;


    }


}
