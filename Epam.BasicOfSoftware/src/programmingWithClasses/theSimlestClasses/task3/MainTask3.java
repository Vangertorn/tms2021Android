package programmingWithClasses.theSimlestClasses.task3;

public class MainTask3 {
    public static void main(String[] args) {

        Student student = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student1 = new Student("Pavel","S.V.",1,new int[]{9,9,9,10,10});
        Student student2 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student3 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student4 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student5 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student6 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student7 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student8 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student student9 = new Student("Oleg","S.V.",5,new int[]{1,2,3,4,5});
        Student[] students = new Student[]{student,student1,student2,student3,student4,student5,student6,student7,student8,student9};
        for(Student s:students){
            if(s.bestStudent()){
                System.out.println(s.getSurnames()+"\t"+s.getGroupNumber());
            }
        }
    }
}
