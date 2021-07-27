package basicOfOOP.task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Calendar {
    private LinkedList<Weekend> weekends;
    private LinkedList<WorkingDay> workingDays;

    public Calendar() {
        weekends = new LinkedList<>();
        workingDays = new LinkedList<>();
    }

    private class Weekend extends Day {
        private String typeOfRecreation;
        private String name;

        public Weekend(String name, int numberDayOfWeek, boolean count, String typeOfRecreation) {
            super(numberDayOfWeek, count);
            this.typeOfRecreation = typeOfRecreation;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Weekend{" +
                    "typeOfRecreation='" + typeOfRecreation + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public void infoCalendar(){
        for(Weekend weekend:weekends){
            System.out.println(weekend.toString());
        }
        for (WorkingDay workingDay: workingDays){
            System.out.println(workingDay.toString());
        }
    }

    public void addDay(Day newDay) {
        if (newDay.isCount()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You must entered name of this weekend");
            String name = scanner.nextLine();
            System.out.println("You must entered type of recreation of this weekend");
            String type = scanner.nextLine();
            Weekend weekend = new Weekend(name, newDay.getNumberDayOfWeek(), newDay.isCount(), type);
            weekends.add(weekend);
        }
        if (!newDay.isCount()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You can entered notes at this workingDay");
            WorkingDay workingDay = new WorkingDay(newDay.getNumberDayOfWeek(), newDay.isCount(), scanner.nextLine());
            workingDays.add(workingDay);
        }


    }

    private class WorkingDay extends Day {
        private String notes;

        public WorkingDay(int numberDayOfWeek, boolean count, String notes) {
            super(numberDayOfWeek, count);
            this.notes = notes;
        }

        @Override
        public String toString() {
            return "WorkingDay{" +
                    "notes='" + notes + '\'' +
                    '}';
        }
    }
}
