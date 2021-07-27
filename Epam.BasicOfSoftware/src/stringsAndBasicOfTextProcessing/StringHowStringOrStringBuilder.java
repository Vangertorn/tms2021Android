package stringsAndBasicOfTextProcessing;

import java.util.Locale;

public class StringHowStringOrStringBuilder {
    public static int maxSpaceInString(String string) {
        int count = 0;
        String[] strings = string.split("(?<=[\\s])+(?=\\S)");
        for (int i = 0; i < strings.length; i++) {
            if (count < (strings[i].length() - strings[i].replaceAll(" ", "").length())) {
                count = strings[i].length() - strings[i].replaceAll(" ", "").length();
            }
        }
        return count;
    }

    public static String recordBAfterA(String s) {
        String recordS = s.replace("a", "ab");
        return recordS;
    }

    public static boolean checkPalindrome(String string) {
        String word = string.trim().toLowerCase(Locale.ROOT);

        boolean coincidence = false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                coincidence = false;
                break;
            } else {
                coincidence = true;
            }
        }
        return coincidence;
    }

    public static String ТортИзИнформатики(String s) {
        String т = s.substring(7, 8);
        String ор = s.substring(3, 5);
        String торт = т.concat(ор).concat(т);
        return торт;
    }

    public static int checkNumberA(String s) {
        int count = 0;
        count = s.length() - s.replace("a", "").length();
        return count;
    }

    public static String repeatAllCharSecondTime(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length() * 2);
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i)).append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String deleteSpaceAndRecurringChar(String s) {
        String s1 = s.trim();
        StringBuilder stringBuilder = new StringBuilder(s1.length());
        stringBuilder.append(s1.charAt(0));
        for (int i = 1; i<s1.length();i++){
            if (s1.charAt(i)!=s1.charAt(i-1)&&s1.charAt(i)!=' '){
                stringBuilder.append(s1.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public  static String mostLongWord(String s){

        String[] words = s.split("\\s");
        String moreLostWord = words[0];
        for(String w: words){
            if (w.length() > moreLostWord.length()) {
                moreLostWord = w;
            }
        }
        return moreLostWord;
    }
    public  static void amountUpperAndLowerCase(String s){
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))) upperCase++;
            if (Character.isLowerCase(s.charAt(i))) lowerCase++;
        }
        System.out.printf("String has %d upperCase and %d lowerCase",upperCase,lowerCase);
    }
    public static int checkSentence(String s){
        String[] sentences = s.split("[.!?]+");
        return sentences.length;
    }

}
