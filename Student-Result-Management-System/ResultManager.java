import java.util.*;

public class ResultManager {
    private List<Student> students;

    public ResultManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
        System.out.println("Student added successfully!");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void sortByMarks() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }

        students.sort((s1, s2) -> s2.getMarks() - s1.getMarks());
        System.out.println("\n--- Sorted by Marks (Descending) ---");
        displayAll();
    }

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topper = Collections.max(
                students,
                Comparator.comparingInt(Student::getMarks)
        );

        System.out.println("\n--- Class Topper ---");
        System.out.println(topper);
    }

    public void searchStudent(String name) {
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("\nStudent Found:");
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
