import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBullying {
    public static void main(String[] args) {
        new RecordString().recordReversString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter names file, please");
        String fileName = scanner.nextLine();
        new TextFormatter().reader(fileName);
    }
}
