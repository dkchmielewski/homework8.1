public class Trainer extends Person {
    private double salary;

    public Trainer(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", zarobki: " + salary + " PLN";
    }
}
