package Homework4.Services;

import Homework4.Model.Person;

import java.util.List;
import java.util.Scanner;

public class MilitaryPart {


    private int size;
    private Person[] sizeMilitary;


    public MilitaryPart(List<Person> fitPeople) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you enter size Military part, please\t ");
        size = scanner.nextInt();
        sizeMilitary = new Person[size];
        for (int i = 0; i < size; i++) {
            sizeMilitary[i] = new Person(0, "UNNAMED", 0, "men");
        }
        int longList = 0;
        for (Person i : fitPeople) {
            longList++;
        }
        for (int i = 0; i < size; i++) {
            if (i > longList - 1) {
                break;
            } else if (sizeMilitary[i].getName() == "UNNAMED") {
                this.sizeMilitary[i] = fitPeople.get(i);
            }

        }

        if (size < longList) {
            for (int i = longList; i > size; i--) {
                System.out.println(fitPeople.get(i - 1).getName() + "\tPerson doesn't enter to MilitaryPart");
            }
        }

    }

    public void newSoldier(Person person) {
        int freeSpace = sizeMilitary.length;
        for (int i = 0; i < sizeMilitary.length; i++) {
            if (sizeMilitary[i].getName() == person.getName() && sizeMilitary[i].getAddress() == person.getAddress() && sizeMilitary[i].getAge()
                    == person.getAge()) {
                System.out.println("We have already taken\t" + person.getName() + "\taway");
                break;

            }
            if (sizeMilitary[i].getName() == "UNNAMED") {
                sizeMilitary[i] = person;
                break;
            }
            freeSpace--;


        }
        if (freeSpace == 0) {
            System.out.println("Go away, MilitaryPart filled\t" + "You have nothing to do here\t" + person.getName());
        }

    }


    public void infoPart() {
        for (int i = 0; i < this.size; i++) {
            if (sizeMilitary[i].getName() == "UNNAMED") {
                break;
            }
            System.out.println(sizeMilitary[i].getName());
        }
    }

    public void freeSpace() {
        int freeSpace = 0;
        for (int i = 0; i < this.size; i++) {
            if (sizeMilitary[i].getName() == "UNNAMED") {
                freeSpace++;
            }
        }
        System.out.println(freeSpace);

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


