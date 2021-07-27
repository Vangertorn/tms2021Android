package programmingWithClasses.theSimlestClasses.task4.Comparators;

import programmingWithClasses.theSimlestClasses.task4.Train;

import java.util.Comparator;

public class TrainComparatorDestinationAndTime implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        if(o1.getDestination().equals(o2.getDestination())){
            return o1.getDepartureTime().compareTo(o2.getDepartureTime());
        } else{
            return o1.getDestination().compareTo(o2.getDestination());
        }
    }
}
