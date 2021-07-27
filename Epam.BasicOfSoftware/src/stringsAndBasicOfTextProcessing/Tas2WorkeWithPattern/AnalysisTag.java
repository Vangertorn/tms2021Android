package stringsAndBasicOfTextProcessing.Tas2WorkeWithPattern;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalysisTag {
    private final String regularExpression;

    public AnalysisTag(String regularExpression) {
        this.regularExpression = regularExpression;
    }

    public List<String> returnContainObject(String s) {
        Pattern notes = Pattern.compile(regularExpression);
        Matcher matcher = notes.matcher(s);
        List<Integer> listTags = new LinkedList<>();
        while (matcher.find()) {
            listTags.add(matcher.start());
            listTags.add(matcher.end());
        }
        List<String> result = new LinkedList<>();
        for (int i = 1; i < listTags.size(); i += 3) {
            result.add(s.substring(listTags.get(i - 1), listTags.get(i)));
            result.add(s.substring(listTags.get(i + 1), listTags.get(i + 2)));
            result.add(s.substring(listTags.get(i), listTags.get(i + 1)).trim());
        }
        return result;
    }
}
