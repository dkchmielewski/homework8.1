import java.util.Arrays;

public class Group {
    private Trainer trainer;
    private Student[] students;
    private String name;
    private int index = 0;

    public Group(Trainer trainer, int size, String name) {
        this.trainer = trainer;
        students = new Student[size];
        this.name = name;
    }

    void addStudent(Student student) {
        if (index < students.length)
            students[index] = student;
        index++;
    }

    void fullInfo() {
        System.out.println("Szkoleniowiec: " + trainer.getInfo());
        System.out.println("Studenci: ");
        for (int i = 0; i < index; i++) {
            System.out.println(students[i].getInfo());
        }
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
