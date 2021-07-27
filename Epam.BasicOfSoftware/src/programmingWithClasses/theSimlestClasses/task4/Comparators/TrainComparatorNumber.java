package programmingWithClasses.theSimlestClasses.task4.Comparators;

import programmingWithClasses.theSimlestClasses.task4.Train;

import java.util.Comparator;

public class TrainComparatorNumber implements Comparator<Train>{
    @Override
    public int compare(Train o1, Train o2) {
        return o1.getTrainNumber() - o2.getTrainNumber();
    }
}
