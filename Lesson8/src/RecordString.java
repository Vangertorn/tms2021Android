import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecordString {
    private static final String RESOURCE_DIR = "Lesson8/resources/";
    private static final String OUTPUT_FILE = RESOURCE_DIR + "output.txt";

    public void recordReversString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter line, please");
        String string = scanner.nextLine();
        char[] writer = new RecordString().revers(string);

        try (FileWriter fileWriter = new FileWriter(OUTPUT_FILE, true)) {
            fileWriter.write(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private char[] revers(String string) {
        char[] chars = new char[string.length()];
        char[] example = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = example[chars.length - i - 1];
        }
        return chars;
    }
}
