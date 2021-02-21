package Homework4.Services;

import Homework4.Exception.PersonServesHereException;
import Homework4.Model.Person;

import java.util.*;


public class MilitaryPart {

    private static int unitNumberCounter = 0;
    private final int size;
    private final int unitNumber;
    private final Person[] sizeMilitary;
    private final List<Person> recruits;
    private int takenPlacesCount = 0;


    public MilitaryPart(int size) {
        this.size = size;
        unitNumber = unitNumberCounter++;
        sizeMilitary = new Person[size];
        recruits = new LinkedList<>();

    }

    public boolean addRecruitToList(Person person) {
        if (getFreePlacesFromList() == 0) {
            System.out.println("Unit number" + unitNumber + " is full");
            return false;
        }
        boolean recruitExists = false;
        try {
            recruitExists = doesRecruitAlreadyExists(person, recruits.toArray(new Person[0]));
        } catch (PersonServesHereException e) {
            e.printStackTrace();
        }
        if (recruitExists) {
            return false;
        }
        recruits.add(person);
        return true;
    }

    public boolean addRecruitToArray(Person person) {
        if (getFreePlacesFromArray() == 0) {
            System.out.println("Unit number" + unitNumber + " is full");
            return false;
        }
        boolean recruitExists = false;
        try {
            recruitExists = doesRecruitAlreadyExists(person, sizeMilitary);
        } catch (PersonServesHereException e) {
            System.out.println(e.getMessage());
        }
        if (recruitExists) {
            return false;
        }
        sizeMilitary[takenPlacesCount++] = person;
        return true;
    }

    public void printRecruitsFromArray() {
        if (getFreePlacesFromArray() == size) {
            System.out.println("Military part  " + unitNumber + " is free!");
        } else {
            if (sortSizeMilitary().length == 1) {
                System.out.println("Military part\t" + unitNumber + "\thas a following soldier");
                System.out.println((1) + "." + "\t" + sortSizeMilitary()[0].getName() + "\t" + sortSizeMilitary()[0].getSurName());
            } else {
                System.out.println("Military part\t" + unitNumber + "\thas the following soldiers");
                for (int i = 0; i < sortSizeMilitary().length; i++) {
                    System.out.println((i + 1) + "." + "\t" + sortSizeMilitary()[i].getName() + "\t" + sortSizeMilitary()[i].getSurName());
                }

            }
            System.out.println("This military part has\t" + getFreePlacesFromArray() + "\tfree places");
        }
    }

    private Person[] sortSizeMilitary() {
        int count = 0;
        for (int i = 0; i < sizeMilitary.length; i++) {
            if (sizeMilitary[i] == null) {
                count++;
            }
        }
        Person[] sortSizeMilitary = new Person[sizeMilitary.length - count];
        for (int i = 0; i < sizeMilitary.length; i++) {
            for (int j = 0; j < sortSizeMilitary.length; j++) {
                if (sizeMilitary[i] != null && sortSizeMilitary[j] == null) {
                    sortSizeMilitary[j] = sizeMilitary[i];
                    break;
                }

            }
        }
        Arrays.sort(sortSizeMilitary, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurName().compareTo(o2.getSurName());
            }
        });
        return sortSizeMilitary;
    }

    public void printRecruitsFromList() {
        for (Person person : recruits) {
            System.out.println(person.getName());
        }
    }


    public int getFreePlacesFromList() {
        return size - recruits.size();
    }

    public int getFreePlacesFromArray() {
        return size - takenPlacesCount;
    }


    public boolean doesRecruitAlreadyExists(Person person, Person[] recruits) throws PersonServesHereException {
        for (Person recruit : recruits) {
            if (recruit != null && recruit.getName().equals(person.getName())
                    && recruit.getAge() == person.getAge()) {
                throw new PersonServesHereException("person\t" + person.getName() + " already serves here");
            }
        }
        return false;
    }
}


