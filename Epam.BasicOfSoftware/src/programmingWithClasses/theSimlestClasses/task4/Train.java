package programmingWithClasses.theSimlestClasses.task4;

import java.util.Calendar;

public class Train {
    private final int trainNumber;
    private final String destination;
    private final Calendar departureTime;


    public Train(int trainNumber, String destination, Calendar departureTime) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }
}
