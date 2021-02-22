package Homework4;


import Homework4.Model.Address;
import Homework4.Model.Person;
import Homework4.Exception.AllMilitaryOfficeFullException;
import Homework4.Services.MilitaryEnlistmentOffice;
import Homework4.Services.MilitaryPart;
import Homework4.Services.Registry;

public class Main {
    public static void main(String[] args) {
        Person kosta = new Person(22, "KOS","Sidorov", 180, "men");
        Address kostas = new Address("Belarus", "Vitebsk");
        kosta.setAddress(kostas);
        Person gleb = new Person(18, "GleB","petrov", 180, "men");
        Address glebs = new Address("Belarus", "Minsk");
        gleb.setAddress(glebs);
        Person olga = new Person(25, "Olga","Tichonova", 180, "women");
        Address olgasAddress = new Address("Belarus", "Minsk");
        olga.setAddress(olgasAddress);
        Person vova = new Person(18, "VoVa","Vodkin", 180, "men");
        Address vovasAddres = new Address("Belarus", "Gomel");

        vova.setAddress(vovasAddres);
        Person sanya = new Person(23, "sasha","Kolos", 155, "men");
        Address sanyasAddress = new Address("Belarus", "Minsk");
        sanya.setAddress(sanyasAddress);
//        Person denis = new Person();
        Registry registry = new Registry(new Person[]{kosta, gleb, olga});

        MilitaryPart part0 = new MilitaryPart(5);
        MilitaryPart part1 = new MilitaryPart(5);
        MilitaryPart part2 = new MilitaryPart(5);


        MilitaryEnlistmentOffice meo1 = new MilitaryEnlistmentOffice(registry, new MilitaryPart[]{part0, part1, part2});
        try {
            meo1.addFitPeopleToTheUnits(new Address("Belarus", "Minsk"));
        } catch (AllMilitaryOfficeFullException e) {
            System.out.println(e.getMessage());

        }
        part1.addRecruitToArray(sanya);
        part1.printRecruitsFromArray();
        part1.addRecruitToArray(vova);
        part0.printRecruitsFromArray();
        part2.printRecruitsFromArray();


    }
}
