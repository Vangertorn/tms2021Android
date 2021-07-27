package stringsAndBasicOfTextProcessing;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[]{"camelCase1","camelCase2","camelCase3","camelCase4","camelCase5","cameCase0"};
//        infoArray(name);

        new StringHowArrayChar().convertCamelCaseInSnake_case(name);
//        infoArray(new StringHowArrayChar().convertCamelCaseInSnake_case(name));
        String s = "word, Word, world, no worad4, nowordfdfdfdfdfa 111>0:4*5/5=6a            no woRld             ";
//        System.out.println(StringHowArrayChar.convertWordOnLetter(s));
//        System.out.println(StringHowArrayChar.quantityDigitInString(s));
//        System.out.println(StringHowArrayChar.quantityNumberInString(s));
//        System.out.println(StringHowArrayChar.deleterSurplusSpace(s));
//        System.out.println(StringHowStringOrStringBuilder.maxSpaceInString(s));
//        System.out.println(StringHowStringOrStringBuilder.recordBAfterA(s));
        String palindrome = "Deed";
//        System.out.println(StringHowStringOrStringBuilder.checkPalindrome(palindrome));
        String Информатика = "Информатика";
//        System.out.println(StringHowStringOrStringBuilder.ТортИзИнформатики(Информатика));
//        System.out.println(StringHowStringOrStringBuilder.checkNumberA(s));
//        System.out.println(StringHowStringOrStringBuilder.repeatAllCharSecondTime(palindrome));
//        System.out.println(StringHowStringOrStringBuilder.deleteSpaceAndRecurringChar(s));
//        System.out.println(StringHowStringOrStringBuilder.mostLongWord(s));
//        StringHowStringOrStringBuilder.amountUpperAndLowerCase(palindrome);
        String someSentences = "One, Win. may be.You cold some! water? ";
        System.out.println(StringHowStringOrStringBuilder.checkSentence(someSentences));




    }

    public static void infoArray(String[] strings){
        for(String s:strings){
            System.out.println(s);
        }
    }
}
