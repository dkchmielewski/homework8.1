import java.util.Arrays;

public class Student extends Person {
    private int id;
    private Grade[] grades = new Grade[50];
    private int gradeIndex = 0;

    public Student(String firstName, String lastName, int age, int id) {
        super(firstName, lastName, age);
        this.id = id;
    }

    void addGrade(Grade grade) {
        grades[gradeIndex] = grade;
        gradeIndex++;
    }

    private String gradeHistory() {
        String history = "Grades: \n";
        for (int i = 0; i < gradeIndex; i++) {
            history += grades[i].getGroup().getName() + " " + grades[i].getGrade() +"\n";
        }
        return history;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", ID number: " + id + ", " + gradeHistory();
    }
}
