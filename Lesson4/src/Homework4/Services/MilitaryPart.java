package Homework4.Services;

import Homework4.Exception.PersonServesHereException;
import Homework4.Model.Person;

import java.util.LinkedList;
import java.util.List;


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
        for (Person person : sizeMilitary) {
            if (person != null) {
                System.out.println(person.getName());
            }

        }
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


