package stringsAndBasicOfTextProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHowArrayChar {

    public String[] convertCamelCaseInSnake_case(String[] camelCase) {
        String[] snake_case = new String[camelCase.length];
        String example = "camelCase";
        String convert = "snake_case";
        for (int i = 0; i < camelCase.length; i++) {
            if (camelCase[i].startsWith(example)) {
                snake_case[i] = camelCase[i].replace(example, convert);
            } else {
                snake_case[i] = camelCase[i];
            }
        }
        return snake_case;
    }

    public static String convertWordOnLetter(String string) {
        String s = string.replace("word", "letter");
        return s;
    }

    public static int quantityDigitInString(String string) {
        int quantityDigit = 0;
        int pos = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find(pos)) {
            pos = matcher.end();
            quantityDigit++;
        }

        return quantityDigit;
    }

    public static int quantityNumberInString(String string) {
        int quantityNumber = 0;
        int pos = 0;
        Pattern pattern = Pattern.compile("(?<=[\\s+=><:*/-])\\d+(?=[\\s,.:;!?<>+=*/-])");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find(pos)) {
            pos = matcher.end();
            quantityNumber++;
        }
        return quantityNumber;
    }

    public static String deleterSurplusSpace(String string) {
        String s = string.trim().replaceAll("\\s+"," ");
        return s;
    }
}
