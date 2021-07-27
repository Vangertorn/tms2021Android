package programmingWithClasses.theSimlestClasses.task10;

import programmingWithClasses.theSimlestClasses.task6.Time;

import java.util.ArrayList;
import java.util.Arrays;

public class Airport {
    private final ArrayList<Airline> arrayListAirport;

    public Airport(Airline[] airlines) {
       arrayListAirport = new ArrayList<>(Arrays.asList(airlines));
    }

    public void searchDestination(String destination){
        for(Airline airline: arrayListAirport){
            if(airline.getDestination().equals(destination)) System.out.println(airline.toString());
        }
        System.out.println("====================================");
    }
    public void searchWeekDays(String weekDay){
        for (Airline airline: arrayListAirport){
            if(airline.getWeekDays().equals(weekDay)) System.out.println(airline.toString());
        }
        System.out.println("====================================");
    }

    public void searchWeekDaysAndDepartureTime(String weekDay, Time departureTime){
        for(Airline airline: arrayListAirport){
            if(airline.getWeekDays().equals(weekDay)){
                if(Time.compareTime(airline.getDepartureTime(),departureTime)>0) System.out.println(airline.toString());
            }
        }
    }


}
