package programmingWithClasses.theSimlestClasses.task4.Comparators;

import programmingWithClasses.theSimlestClasses.task4.ScheduleTrains;
import programmingWithClasses.theSimlestClasses.task4.Train;

import java.util.LinkedList;
import java.util.TreeSet;

public class TrainComparator {
   public static void sortNumber(ScheduleTrains scheduleTrains){
       TrainComparatorNumber trainComparatorNumber = new TrainComparatorNumber();
       TreeSet<Train> treeSet = new TreeSet<>(trainComparatorNumber);
       treeSet.addAll(scheduleTrains.getSchedule().values());
       for (Train train:treeSet){
           System.out.printf("The train number %d goes to %s at %3$td %3$tB %3$tY %3$tr\n",train.getTrainNumber(), train.getDestination(), train.getDepartureTime());
       }
       System.out.println("========================================================");
   }
   public static void sortDestination(ScheduleTrains scheduleTrains){
       TrainComparatorDestinationAndTime trainComparatorDestination = new TrainComparatorDestinationAndTime();
       LinkedList<Train> linkedList = new LinkedList<>(scheduleTrains.getSchedule().values());
       linkedList.sort(trainComparatorDestination);
       for (Train train:linkedList){
           System.out.printf("The train number %d goes to %s at %3$td %3$tB %3$tY %3$tr\n",train.getTrainNumber(), train.getDestination(), train.getDepartureTime());
       }
       System.out.println("======================================================");
   }
}
