package programmingWithClasses.theSimlestClasses.task10;

import programmingWithClasses.theSimlestClasses.task6.Time;


public class MainTask10 {
    public static void main(String[] args) {
        Airline airline = new Airline("Moskva",2342,"Boing", new Time(8,12,31), "monday");
        Airline airline1 = new Airline("Minsk",22342,"Boing", new Time(10,14,31), "monday");
        Airline airline2 = new Airline("Kiev",234542,"Boing", new Time(12,6,31), "monday");
        Airline airline3 = new Airline("Moskva",235642,"Boing", new Time(8,12,31), "sunday");
        Airline airline4 = new Airline("Minsk",236842,"Boing", new Time(10,12,36), "sunday");
        Airline airline5 = new Airline("Warsaw",23412,"Boing", new Time(8,46,31), "monday");
        Airline[] airlines = new Airline[]{airline,airline1,airline2,airline3,airline4,airline5};
        Airport airport = new Airport(airlines);
        airport.searchDestination("Moskva");
        airport.searchWeekDays("monday");
        airport.searchWeekDaysAndDepartureTime("sunday", new Time(9,0,0));
    }

}
