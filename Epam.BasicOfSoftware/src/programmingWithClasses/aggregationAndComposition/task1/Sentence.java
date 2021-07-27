package programmingWithClasses.aggregationAndComposition.task1;

import java.util.Arrays;

public class Sentence {
    private final Word[] words;
    private final char finalChar;

    public Sentence(Word[] words, char finalChar) {
        this.words = words;
        this.finalChar = finalChar;
    }

    @Override
    public String toString() {
        String s  = words[0].toString()+" ";
        for (int i =1; i< words.length;i++) {
            s = s + words[i].toString() + " ";
        }
        s = s.trim()+finalChar;
        return s;
    }
}
