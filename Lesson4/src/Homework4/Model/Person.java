package Homework4.Model;

import java.util.Scanner;

public class Person {
    public static final String MALE = "men";
    public static final String FEMAILE = "female";
    private int age;
    private String name;
    private int height;
    private String gender;
    private Address address;

    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert age\t");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert name\t");
        this.name = scanner.nextLine();
        System.out.print("Insert height\t");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert gender\t");
        this.gender = scanner.nextLine();
        this.address = new Address();

    }

    public Person(int age, String name, int height, String gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.gender = gender;

    }

    public int getAge() {

        return age;

    }

    public int setAge(int age) {

        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
