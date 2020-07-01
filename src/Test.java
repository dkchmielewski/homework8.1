public class Test {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Jan", "Kowalski", 35, 1.0);
        Student[] student = new Student[10];
        student[0] = new Student("Piotr", "Nowak", 26, 2.0);
        student[1] = new Student("Anna", "Rogowska", 29, 3.0);
        Class class1 = new Class(trainer1, student[0], student[1]);
        System.out.println(class1.toString());
    }
}
