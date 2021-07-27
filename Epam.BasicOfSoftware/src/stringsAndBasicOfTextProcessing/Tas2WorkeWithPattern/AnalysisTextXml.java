package stringsAndBasicOfTextProcessing.Tas2WorkeWithPattern;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalysisTextXml {
    private final String text;

    public AnalysisTextXml(String text) {
        this.text = text;
    }

    public List<Integer> returnTagWithoutBody() {
        Pattern notesWithoutBody = Pattern.compile("<\\w*/>");
        Matcher matcher = notesWithoutBody.matcher(text);
        List<Integer> listWithoutBody = new LinkedList<>();
        while (matcher.find()) {
            listWithoutBody.add(matcher.start());
            listWithoutBody.add(matcher.end());
        }
        for(int i = 0; i<listWithoutBody.size();i+=2){
            System.out.println("Tag\t"+text.substring(listWithoutBody.get(i),listWithoutBody.get(i+1))+
                    "\t isn't body. Tag is located\t"+listWithoutBody.get(i)+", "+(listWithoutBody.get(i+1)));
        }

        return listWithoutBody;
    }

    public void analysisContainNotes() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*notes[^/]*?>");
        String[] notesTag = this.splitNotes();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, notesTag);
        buildAnswer.answer();
    }

    public void returnContainNote() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*note[^s/]*?>");
        String[] noteTag = this.splitNote();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, noteTag);
        buildAnswer.answer();
    }

    public void returnContainTo() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*to[^/]*?>");
        String[] toTag = this.splitTo();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, toTag);
        buildAnswer.answer();
    }

    public void returnContainFrom() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*from[^/]*?>");
        String[] fromTag = this.splitFrom();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, fromTag);
        buildAnswer.answer();
    }
    public void returnContainHeading() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*heading[^/]*?>");
        String[] headingTag = this.splitHeading();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, headingTag);
        buildAnswer.answer();
    }
    public void returnContainBody() {
        AnalysisTag analysisTag = new AnalysisTag("<\\W*body[^/]*?>");
        String[] bodyTag = this.splitBody();
        BuildAnswer buildAnswer = new BuildAnswer(analysisTag, bodyTag);
        buildAnswer.answer();
    }



    private String[] splitNotes() {
        return text.split("(?<=(<\\Wnotes>))");
    }

    private String[] splitNote() {
        return text.split("(?<=(<\\Wnote>))");
    }

    private String[] splitTo() {
        return text.split("(?<=(<\\Wto>))");
    }

    private String[] splitFrom() {
        return text.split("(?<=(<\\Wfrom>))");
    }
    private String[] splitHeading() {
        return text.split("(?<=(<\\Wheading>))");
    }
    private String[] splitBody() {
        return text.split("(?<=(<\\Wbody>))");
    }
}
