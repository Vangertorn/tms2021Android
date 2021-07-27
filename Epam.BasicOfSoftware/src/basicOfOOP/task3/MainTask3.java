package basicOfOOP.task3;

public class MainTask3 {
    public static void main(String[] args) {
        Day day = new Day(2,true);
        Day day1 = new Day(3,false);
        Day day2 = new Day(7, true);
        Calendar calendar = new Calendar();
        calendar.addDay(day);
        calendar.addDay(day1);
        calendar.addDay(day2);
        calendar.infoCalendar();

    }
}
