package stringsAndBasicOfTextProcessing.Tas2WorkeWithPattern;

public class MaineTask2 {
    public static void main(String[] args) {
        String text = "<notes> <note id = \"1\"> <to>Вася</to> <from>Света</from> <heading>Напоминание</heading> " +
                "<body>Позвони мне завтра</body> </note> <note id = \"2\"> <to>Петя</to> <from>Маша</from> <heading>" +
                "Важное напоминание</heading> <body/> </note> </notes> <notes> <note/> </notes>";
        AnalysisTextXml analysisTextXml = new AnalysisTextXml(text);
        analysisTextXml.analysisContainNotes();
        analysisTextXml.returnContainNote();
        analysisTextXml.returnContainTo();
        analysisTextXml.returnContainFrom();
        analysisTextXml.returnContainHeading();
        analysisTextXml.returnContainBody();
        analysisTextXml.returnTagWithoutBody();

    }
}
