public class Class {
    private Trainer trainer;
    private Student student1;
    private Student student2;

    public Class(Trainer trainer, Student student, Student student2) {
        this.trainer = trainer;
        this.student1 = student;
        this.student2 = student2;
    }

    @Override
    public String toString() {
        return "Class{" +
                "trainer=" + trainer.getAge() + " " + trainer.getFirstName() + " " + trainer.getLastName() +
                " " + trainer.getSalary() +
                ", student1=" + student1.getAge() + " " + student1.getFirstName() + " " + student1.getLastName() +
                " " + student1.getSpending() +
                ", student2=" + student2.getAge() + " " + student2.getFirstName() + " " + student2.getLastName() +
        " " + student2.getSpending() +
                '}';
    }
}
