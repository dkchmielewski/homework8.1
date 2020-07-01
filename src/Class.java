public class Class {
    private String name;
    private Trainer trainer;
    private Student student1;
    private Student student2;
    private Student student3;

    public Class(Trainer trainer, Student student1, Student student2, String name) {
        this.trainer = trainer;
        this.student1 = student1;
        this.student2 = student2;
        this.name = name;
    }

    public String toString1() {
        return "Class1{" + name + " " +
                "trainer=" + trainer.getAge() + " " + trainer.getFirstName() + " " + trainer.getLastName() +
                " " + trainer.getSalary() +
                ", student1=" + student1.getAge() + " " + student1.getFirstName() + " " + student1.getLastName() +
                " " + student1.getSpending() + " Grade: " + student1.getGrade() +
                ", student2=" + student2.getAge() + " " + student2.getFirstName() + " " + student2.getLastName() +
        " " + student2.getSpending() +
                '}';
    }
    public String toString2() {
        return "Class2{" + name + " " +
                "trainer=" + trainer.getAge() + " " + trainer.getFirstName() + " " + trainer.getLastName() +
                " " + trainer.getSalary() +
                ", student1=" + student1.getAge() + " " + student1.getFirstName() + " " + student1.getLastName() +
                " " + student1.getSpending() + " Grade: " + student1.getGrade() +
                ", student2=" + student2.getAge() + " " + student2.getFirstName() + " " + student2.getLastName() +
                " " + student2.getSpending() +
                '}';
    }
}
