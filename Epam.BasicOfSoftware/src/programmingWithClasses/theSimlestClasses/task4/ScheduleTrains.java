package programmingWithClasses.theSimlestClasses.task4;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ScheduleTrains {
    private final LinkedHashMap<Integer, Train> schedule = new LinkedHashMap<>();

    public void addTrain(Train train){
        schedule.put(train.getTrainNumber(),train);
    }

    public LinkedHashMap<Integer, Train> getSchedule() {
        return schedule;
    }
    public void trainInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can You enter train number, please");
        int number = Integer.parseInt(scanner.nextLine());
        Train train = schedule.get(number);
        System.out.printf("The train number %d goes to %s at %3$td %3$tB %3$tY %3$tr\n",train.getTrainNumber(), train.getDestination(), train.getDepartureTime());
        System.out.println("==============================================================");
    }
}
