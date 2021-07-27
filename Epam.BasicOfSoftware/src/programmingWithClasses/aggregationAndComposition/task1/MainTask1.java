package programmingWithClasses.aggregationAndComposition.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Word word = new Word(new char[]{'w','o','r','d'});
//        System.out.println(word.toString());
        Word word1 = new Word(new char[]{'H','e','l','l','o'});
        Sentence sentence = new Sentence(new Word[]{word,word1},'.');
//        System.out.println(sentence.toString());
        Text text = new Text(new Sentence[]{sentence},new Sentence(new Word[]{new Word(new char[]{'D','a','r','k','n','e','s','s'})},'!'));
        text.printTitle();
        System.out.println(text.toString());
        text.addText(new Sentence[]{sentence});
        System.out.println(text.toString());
    }



}
