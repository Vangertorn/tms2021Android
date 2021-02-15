package Homework4.Services;

import Homework4.Exception.AllMilitaryOfficeFullException;
import Homework4.Model.Address;
import Homework4.Model.Person;

import java.util.LinkedList;
import java.util.List;

import static Homework4.Model.Person.MALE;


public class MilitaryEnlistmentOffice {
    private final Registry registry;
    private final MilitaryPart[] militaryPart;

    public MilitaryEnlistmentOffice(Registry registry, MilitaryPart[] militaryPart) {
        this.registry = registry;
        this.militaryPart = militaryPart;
    }

    public List<Person> getFitPeople(Address address) {
        List<Person> peopleByAddress = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleByAddress) {
            if (isPersonFit(person)) {
                System.out.printf("%s is fit!\n", person.getName());
                fitPeople.add(person);

            }
        }
        return fitPeople;
    }

    public void addFitPeopleToTheUnits(Address address) throws AllMilitaryOfficeFullException {
        List<Person> fitPeople = getFitPeople(address);
        int unitIndex = 0;
        MilitaryPart unit;
        for (Person person : fitPeople) {
            boolean personSentToUnit;
            do {
                unit = militaryPart[unitIndex];
                personSentToUnit = unit.addRecruitToArray(person);
                if (!personSentToUnit) {
                    unitIndex++;
                }

            } while (!personSentToUnit && unitIndex < militaryPart.length);
            if (unitIndex == militaryPart.length) {
                throw new AllMilitaryOfficeFullException("All units are full");
            }
        }

    }

    public int getCapacity() {
        int sum = 0;
        for (MilitaryPart part : militaryPart) {
            sum += part.getFreePlacesFromArray();
        }
        return sum;
    }

    private boolean isPersonFit(Person person) {
        return MALE.equals(person.getGender())
                && person.getAge() > 17
                && person.getAge() < 28;
    }


}
