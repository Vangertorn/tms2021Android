package stringsAndBasicOfTextProcessing.Task1WorkeWithPattern;

public class MainTask1 {
    public static void main(String[] args) {
        String newText = "It was almost December, and Jonas was beginning to be frightened. No.Wrong word, Jonas thought. Frightened meant that deep, sickening feelingof something terrible about to happen. Frightened was the way he hadfelt a year ago when an unidentified aircraft had overflown thecommunity twice. He had seen it both times. Squinting toward the sky, hehad seen the sleek jet, almost a blur at its high speed, go past, and asecond later heard the blast of sound that followed. Then one more time,a moment later, from the opposite direction, the same plane.\n" +
                "At first, he had been only fascinated. He had never seen aircraft soclose, for it was against the rules for Pilots to fly over thecommunity.\n " +
                "Occasionally, when supplies were delivered by cargo planes tothe landing field across the river, the children rode their bicycles tothe riverbank and watched, intrigued, the unloading and then the takeoffdirected to the west, always away from the community.\n" +
                "But the aircraft a year ago had been different. It was not a squat,fat-bellied cargo plane but a needle-nosed single-pilot jet. Jonas,looking around anxiously, had seen others—adults as well aschildren—stop what they were doing and wait, confused, for anexplanation of the frightening event.\n";
        Sort sort = new Sort(newText);
        for (String s : sort.sortTextParagraphs()) {
//            System.out.println(s);

        }
//        for (String w : Sort.sortWordLength(Sort.splitSentences(sort.sortTextParagraphs()[0])[0])) {
//            System.out.println(w);
//        }
        for (String w : Sort.sortWordRepetitionsCharacter(Sort.splitSentences(sort.sortTextParagraphs()[0])[0],'e')) {
            System.out.println(w);

        }
    }
}
