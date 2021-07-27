package stringsAndBasicOfTextProcessing.Tas2WorkeWithPattern;

import java.util.List;

public class BuildAnswer {
    private final AnalysisTag buildAnswer;
    private final String[] split;

    public BuildAnswer(AnalysisTag buildAnswer, String[] split) {
        this.buildAnswer = buildAnswer;
        this.split = split;
    }

    public void answer() {
        for (String s : split) {
            List<String> list = buildAnswer.returnContainObject(s);
            if (list.size() > 0) {
                System.out.println("open tag is\t" + list.get(0));
                System.out.println("close tag is\t" + list.get(1));
                System.out.println("body tag is\t" + list.get(2));
                System.out.println("===============================================================");
            }
        }
    }
}
