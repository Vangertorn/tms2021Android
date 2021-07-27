package stringsAndBasicOfTextProcessing.Task1WorkeWithPattern;

import java.util.*;

public class Sort {
    private final String text;

    public Sort(String text) {
        this.text = text;
    }

    public String[] sortTextParagraphs() {
        String[] paragraphs = text.split("\\n");
        LinkedList<Paragraphs> paragraphsLinkedList = new LinkedList<>();
        for (String paragraph : paragraphs) {
            Paragraphs p = new Paragraphs(paragraph, splitSentences(paragraph).length);
            paragraphsLinkedList.add(p);
        }
        paragraphsLinkedList.sort(new ParagraphsSorting());
        String[] paragraphsSort = new String[paragraphsLinkedList.size()];
        for (int i = 0; i < paragraphsSort.length; i++) {
            paragraphsSort[i] = paragraphsLinkedList.get(i).getText();
        }
        return paragraphsSort;
    }

    public static String[] sortWordLength(String sentences) {
        String[] words = splitWords(sentences);
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return words;
    }

    public static String[] sortWordRepetitionsCharacter(String sentences, Character character) {
        String[] words = splitWords(sentences);
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res =  Math.toIntExact((o2.codePoints().filter(ch -> ch == character).count() - o1.codePoints().filter(ch -> ch == character).count()));
                if (res==0){
                    res = o1.compareToIgnoreCase(o2);
                }
                return res;
            }
        });
        return words;
    }

    public static String[] splitSentences(String string) {
        return string.split("(?<=[.!?])\\s+");
    }

    public static String[] splitWords(String string) {
        return string.split("[,.:;?!\\s]+");
    }
}
