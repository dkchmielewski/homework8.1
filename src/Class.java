public class Class {
    Trainers trainer1 = new Trainers("X", "Y", 46, 20000.0);
    Students student1 = new Students("A", "B", 33, 400.0);
    Students student2 = new Students("C", "D", 35, 500.0);
    public void class1() {
        System.out.println(trainer1.toString() + student1.toString() + student2.toString());
    }

    @Override
    public String toString() {
        return "Class{" +
                "trainer1=" + trainer1 +
                ", student1=" + student1 +
                ", student2=" + student2 +
                '}';
    }

}
