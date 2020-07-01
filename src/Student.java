public class Student extends Person {
    private double spending;

    public Student(String firstName, String lastName, int age, double spending) {
        super(firstName, lastName, age);
        this.spending = spending;
    }

    public double getSpending() {
        return spending;
    }
}
