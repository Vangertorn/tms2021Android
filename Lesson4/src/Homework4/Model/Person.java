package Homework4.Model;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Person implements Comparable<Person>{
    public static final String MALE = "men";
    public static final String FEMALE = "female";
    private int age;
    private String name;
    private String surName;
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
        System.out.print("Insert Surname\t");
        this.name = scanner.nextLine();
        System.out.print("Insert height\t");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert gender\t");
        this.gender = scanner.nextLine();
        this.address = new Address();

    }

    public Person(int age, String name, String surName, int height, String gender) {
        this.age = age;
        this.name = name;
        this.surName = surName;
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
        name.trim();
        String newName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        if ((newName.length()-newName.replaceAll(" ","").length())==0){
            return newName;
        }
        return "Error, name contain space";
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

    public String getSurName() {
        surName.trim();
        String newSurName = surName.substring(0,1).toUpperCase() +surName.substring(1).toLowerCase();
        if (newSurName.length()-newSurName.replaceAll(" ","").length()==0){
            return newSurName;
        }
        return "Error, name contain space";
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Person o) {
        return toString().compareTo(o.toString());
    }
}
