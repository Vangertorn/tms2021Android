package programmingWithClasses.theSimlestClasses.task4;

import programmingWithClasses.theSimlestClasses.task4.Comparators.TrainComparator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainTask4 {
    public static void main(String[] args) {
        Train train = new Train(12,"Minsk",new GregorianCalendar(2021, Calendar.MARCH,17,9,40));
        Train train1 = new Train(73,"Minsk",new GregorianCalendar(2021, Calendar.MARCH,17,9,25));
        Train train2 = new Train(346,"Moscow",new GregorianCalendar(2021, Calendar.MARCH,17,7,25));
        Train train3 = new Train(38,"Gomel",new GregorianCalendar(2021, Calendar.MARCH,17,8,45));
        Train train4 = new Train(11723,"Warsaw",new GregorianCalendar(2021, Calendar.MARCH,17,8,17));
        ScheduleTrains scheduleTrains = new ScheduleTrains();
        scheduleTrains.addTrain(train);
        scheduleTrains.addTrain(train1);
        scheduleTrains.addTrain(train2);
        scheduleTrains.addTrain(train3);
        scheduleTrains.addTrain(train4);
        TrainComparator.sortNumber(scheduleTrains);
        scheduleTrains.trainInfo();
        TrainComparator.sortDestination(scheduleTrains);




    }
}
