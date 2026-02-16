import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResultManager manager = new ResultManager();

        while (true) {
            System.out.println("\n===== Student Result Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Sort by Marks");
            System.out.println("4. Show Topper");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    manager.addStudent(name, marks);
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    manager.sortByMarks();
                    break;

                case 4:
                    manager.showTopper();
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    manager.searchStudent(searchName);
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
