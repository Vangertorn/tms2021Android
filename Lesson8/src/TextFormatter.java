import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter implements MyReader {

    private static final String RESOURCE_DIR = "Lesson8/resources/";
    private static final String OUTPUT_FILE = RESOURCE_DIR + "new text.txt";

    public void reader(String nameFile) {
        try (FileReader fileReader = new FileReader(RESOURCE_DIR + nameFile);
             FileWriter fileWriter = new FileWriter(OUTPUT_FILE, false)) {
            int i;
            StringBuilder result = new StringBuilder();
            char[] text = new char[256];
            while ((i = fileReader.read(text)) > -1) {
                if (i < 256) {
                    text = Arrays.copyOf(text, i);
                }
                result.append(text);
            }
            String[] line = splitOffers(result.toString());
            for (int j = 0; j < line.length; j++) {
                if (counterWord(line[j]) >= 3 && counterWord(line[j]) <= 5) {
                    fileWriter.write(line[j]);
                    continue;
                } else if (checkPalindrome(line[j])) {
                    fileWriter.write(line[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] splitOffers(String string) {
        String[] offers = string.split("[.!?]+");
        return offers;
    }

    public static int counterWord(String string) {
        Pattern pattern = Pattern.compile("\\b");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (matcher.find()) {
                count++;
            }
        }
        int numberWord = count / 2;

        return numberWord;
    }

    public static boolean checkPalindrome(String string) {
        String[] words = string.split("[.,:;?!\\s]+");
        boolean[] coincidence = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length() / 2; j++) {
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1)) {
                    coincidence[i] = false;
                    break;
                } else {
                    coincidence[i] = true;
                }
            }
        }
        for (int i = 0; i < coincidence.length; i++) {
            if (coincidence[i] == true) {
                return true;
            }
        }
        return false;
    }
}
