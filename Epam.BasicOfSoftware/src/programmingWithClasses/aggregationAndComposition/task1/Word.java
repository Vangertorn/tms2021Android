package programmingWithClasses.aggregationAndComposition.task1;

import java.util.Arrays;

public class Word {
    private final char[] chars;

    public Word(char[] chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {

        return  String.valueOf(chars);
    }
}
