package programmingWithClasses.theSimlestClasses.task10;

import programmingWithClasses.theSimlestClasses.task6.Time;

public class Airline {
    private String destination;
    private int number;
    private String typePlane;
    private Time departureTime;
    private String weekDays;

    public Airline(String destination, int number, String typePlane,Time departureTime, String weekDays) {
        this.destination = destination;
        this.number = number;
        this.typePlane = typePlane;
        this.departureTime = departureTime;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", typePlane='" + typePlane + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", weekDays='" + weekDays + '\'' +
                '}';
    }
}
