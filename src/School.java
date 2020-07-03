public class School {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Jan", "Kowalski", 35, 10000.0);
        Student student1 = new Student("Rafal", "T", 26, 19862);
        Student student2 = new Student("Konrad", "L", 29, 32356);
        Student student3 = new Student("Anna", "C", 25, 95265);

        Group group1 = new Group(trainer1, 10, "Matematyka");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.fullInfo();

        Trainer trainer2 = new Trainer("Artur", "M", 39, 20.0);
        Group group2 = new Group(trainer2, 9, "Informatyka");
        group2.addStudent(student2);

        Grade grade1 = new Grade(student2, group1, 3);
        Grade grade2 = new Grade(student2, group2, 5);
        student2.addGrade(grade1);
        student2.addGrade(grade2);
        System.out.println(student2.getInfo());

    }
}
