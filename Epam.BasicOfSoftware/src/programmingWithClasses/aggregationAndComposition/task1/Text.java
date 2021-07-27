package programmingWithClasses.aggregationAndComposition.task1;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;
    private final Sentence title;

    public Text(Sentence[] sentences, Sentence title) {
        this.sentences = sentences;
        this.title = title;
    }
    public void printTitle(){
        System.out.println(title.toString());
    }

    @Override
    public String toString() {
        String s  = sentences[0].toString()+" ";
        for (int i =1; i< sentences.length;i++) {
            s = s + sentences[i].toString();
        }
        return s;
    }
    public void addText(Sentence[] sentences){
        Sentence[] newSentence = Arrays.copyOf(this.sentences,this.sentences.length+sentences.length);
        System.arraycopy(sentences,0,newSentence,this.sentences.length,sentences.length);

        this.sentences = newSentence;
    }
}
