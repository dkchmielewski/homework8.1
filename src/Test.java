public class Test {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Jan", "Kowalski", 35, 1.0);
        Student[] student = new Student[10];
        student[0] = new Student("Piotr", "Nowak", 26, 2.0);
        student[1] = new Student("Anna", "Rogowska", 29, 3.0);
        student[2] = new Student("Rafal", "Kos", 28, 4.0);
        student[0].setGrade(10);
        Class class1 = new Class(trainer1, student[0], student[1], "java");
        System.out.println(class1.toString1());
        student[0].setGrade(20);
        Class class2 = new Class(trainer1, student[0], student[2], "python");
        System.out.println(class2.toString2());

    }
}
