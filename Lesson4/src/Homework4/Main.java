package Homework4;


import Homework4.Model.Address;
import Homework4.Model.Person;
import Homework4.Services.MilitaryEnlistmentOffice;
import Homework4.Services.Registry;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person kosta = new Person(22, "KOS", 180, "men");
        Address kostas = new Address("Belarus", "Vitebsk");
        kosta.setAddress(kostas);
        Person gleb = new Person(18, "Gleb", 180, "men");
        Address glebs = new Address("Belarus", "Minsk");
        gleb.setAddress(glebs);
        Person olga = new Person(25, "Olga", 180, "women");
        Address olgasAddress = new Address("Belarus", "Minsk");
        olga.setAddress(olgasAddress);
        Person vova = new Person();
        Person denis = new Person();
        Registry registry = new Registry(new Person[]{kosta, gleb, olga, vova, denis});

        MilitaryEnlistmentOffice meo = new MilitaryEnlistmentOffice(registry);
        List<Person> personList = meo.getPeople(new Address("Belarus", "Vitebsk"));

        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
