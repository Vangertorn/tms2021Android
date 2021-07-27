package stringsAndBasicOfTextProcessing.Task1WorkeWithPattern;

import java.util.Comparator;

public class ParagraphsSorting implements Comparator<Paragraphs> {

    @Override
    public int compare(Paragraphs o1, Paragraphs o2) {
        return o2.getAmountSentences() - o1.getAmountSentences();
    }
}
