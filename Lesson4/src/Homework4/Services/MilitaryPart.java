package Homework4.Services;

import Homework4.Model.Person;

import java.util.List;
import java.util.Scanner;

public class MilitaryPart {


    private int size;
    private Person[] sizeMilitary;
    private int freeSpace;


    public MilitaryPart(int size) {
        this.size = size;
        this.freeSpace = size;
        sizeMilitary = new Person[size];

    }

    public MilitaryPart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you enter size Military part, please\t ");
        size = scanner.nextInt();
        this.freeSpace = size;
        sizeMilitary = new Person[size];
    }

    public void newSoldier(List<Person> fitPeople) {
        int longList = 0;
        for (Person i : fitPeople) {
            longList++;
        }
        for (int i = 0; i < size; i++) {
            if (i > longList - 1) {
                break;
            } else if (sizeMilitary[i] == null) {
                this.sizeMilitary[i] = fitPeople.get(i);
                this.freeSpace--;
            }
        }
        if (size < longList) {
            for (int i = longList; i > size; i--) {
                System.out.println(fitPeople.get(i - 1).getName() + "\tPerson doesn't enter to MilitaryPart");
            }
        }

    }

    public void newSoldier(Person person) {
        for (int i = 0; i < sizeMilitary.length; i++) {
            if (freeSpace == 0) {
                System.out.println("Go away, MilitaryPart filled\t" + "You have nothing to do here\t" + person.getName());
                break;
            }
            if (sizeMilitary[i] == null) {
                sizeMilitary[i] = person;
                this.freeSpace--;
                break;
            }

            if (sizeMilitary[i] != null && sizeMilitary[i].getName().equals(person.getName()) && sizeMilitary[i].getAddress().equals(person.getAddress())
                    && sizeMilitary[i].getAge() == person.getAge()) {
                System.out.println("We have already taken\t" + person.getName() + "\taway");
                break;

            }

        }


    }

    public void infoPart() {
        for (int i = 0; i < this.size; i++) {
            if (sizeMilitary[i] == null) {
                break;
            }
            System.out.println(sizeMilitary[i].getName());
        }
    }

    public int freeSpace() {

        return freeSpace;

    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Person[] getSizeMilitary() {
        return sizeMilitary;
    }

    public void setSizeMilitary(Person[] sizeMilitary) {
        this.sizeMilitary = sizeMilitary;
    }
}


