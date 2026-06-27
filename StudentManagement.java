import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = new String[5];
        int count = 0;

        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < students.length) {
                        System.out.print("Enter student name: ");
                        students[count] = sc.nextLine();
                        count++;
                        System.out.println("Student added!");
                    } else {
                        System.out.println("Student list is full!");
                    }
                    break;

                case 2:
                    System.out.println("\nStudents:");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + students[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}