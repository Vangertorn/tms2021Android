package programmingWithClasses.theSimlestClasses.task3;

public class Student {
    private final String surnames;
    private final String initials;
    private final int groupNumber;
    private final int[] learningAchievement;

    public Student(String surnames, String initials, int groupNumber, int[] learningAchievement) {
        this.surnames = surnames;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.learningAchievement = learningAchievement;
    }
    public boolean bestStudent(){
        boolean count = true;
        for(int i:learningAchievement){
            if (i < 9) {
                count = false;
                break;
            }
        }
        return count;
    }

    public String getSurnames() {
        return surnames;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
