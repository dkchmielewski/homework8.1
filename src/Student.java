public class Student extends Person {
    private double spending;
    private int grade;

    public Student(String firstName, String lastName, int age, double spending) {
        super(firstName, lastName, age);
        this.spending = spending;
    }

    public double getSpending() {
        return spending;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
