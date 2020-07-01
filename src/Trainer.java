public class Trainer extends Person {
    private double salary;

    public Trainer(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
