package stringsAndBasicOfTextProcessing.Task1WorkeWithPattern;


public class Paragraphs {
    private final String text;
    private final int amountSentences;

    public String getText() {
        return text;
    }

    public int getAmountSentences() {
        return amountSentences;
    }

    public Paragraphs(String text, int amountSentences) {
        this.text = text;
        this.amountSentences = amountSentences;
    }

}
