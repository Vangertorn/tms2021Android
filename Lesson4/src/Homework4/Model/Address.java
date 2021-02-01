package Homework4.Model;

import java.util.Scanner;

public class Address {
    private String country;
    private String city;


    public Address() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String Country\t");
        country = scanner.nextLine();
        System.out.print("String City\t");
        city = scanner.nextLine();

    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
